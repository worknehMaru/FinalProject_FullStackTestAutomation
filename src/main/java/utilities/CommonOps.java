package utilities;


import com.google.common.util.concurrent.Uninterruptibles;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import pageObject.mortgage.MainPage;
import workFlows.ElectronFlows;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base{
    public static String getData (String nodeName)
    {
        File fxmFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc = null;
        try
        {
            fxmFile = new File("./Configuration/DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fxmFile);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            System.out.println("Error Reading xml: " + e);
        }
        finally
        {
            return  doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    @Deprecated
    public static void initBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid browser Type");
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("Timeout")));
        action = new Actions(driver);
        driver.get(getData("Url"));
        ManagePages.initGrafana();
        driver.manage().window().maximize();
    }

    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefoxDriver()
    {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
    @Deprecated
    public static void initMobile(){
        dc.setCapability(MobileCapabilityType.           UDID,                  getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.    APP_PACKAGE,           getData("AppPackage"));
        dc.setCapability(AndroidMobileCapabilityType.    APP_ACTIVITY,          getData("AppActivity"));
        try {
            mobileDriver = new AndroidDriver<>(new URL(getData("AppiumServer")), dc);
        } catch (MalformedURLException e) {
            System.out.println("Can not connect to Appium Server See Details: + ");
        }
        ManagePages.initMortgage();
        //mobileDriver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")), TimeUnit.SECONDS);
        wait = new WebDriverWait(mobileDriver, Long.parseLong(getData("Timeout")));
    }

    public static void initAPI(){
        RestAssured.baseURI= getData("urlAPI");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("UserName"),getData("PassWord"));
    }

    //For Electron App For Examole (TodoList App)
    @Deprecated
    public static void initElectronApp(){
        System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("ElectronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        ManagePages.initToDoListApp();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")), TimeUnit.SECONDS);
        wait       = new WebDriverWait(driver,Long.parseLong(getData("Timeout")));
        action     = new Actions(driver);
    }

    @Deprecated
    public static void initDesktopApp(){
        dc.setCapability("chromeOptions", getData("CalculatorApp"));
        try {
            driver  = new WindowsDriver(new URL(getData("AppiumServerDesktop")),dc);
        } catch (Exception e) {
            System.out.println("Can Not Connect to Appium Server, See details : " + e );
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")), TimeUnit.SECONDS);
        wait       = new WebDriverWait(driver,Long.parseLong(getData("Timeout")));
        ManagePages.initCalculator();
        action     = new Actions(driver);

    }

    @BeforeTest
    public  void StartSession()  {
     if (getData("PlatformName").equalsIgnoreCase("web"))
         initBrowser(getData("BrowserName"));
     else if(getData("PlatformName").equalsIgnoreCase("mobile"))
       initMobile();
     else if (getData("PlatformName").equalsIgnoreCase("api"))
         initAPI();
     else if (getData("PlatformName").equalsIgnoreCase("electron"))
         initElectronApp();
     else if(getData("PlatformName").equalsIgnoreCase("desktop"))
         initDesktopApp();
     else
         throw new RuntimeException("Invalid Platform Name");
        softAssert = new SoftAssert();
        screen = new Screen();
        action     = new Actions(driver);

    }

    @AfterClass
    public  void CloseSession()
    {
        if(!getData("PlatformName").equalsIgnoreCase("api")){
            if (!getData("PlatformName").equalsIgnoreCase("mobile"))
                driver.quit();
        }
    }
    @AfterMethod
    public void afterMethod(){
        if (getData("PlatformName").equalsIgnoreCase("web"))
        driver.get(getData("Url"));
        else if(getData("PlatformName").equalsIgnoreCase("electron"))
            ElectronFlows.emptyList();
    }
    @BeforeMethod
    public void beforeMethod(Method method){
        if(!getData("PlatformName").equalsIgnoreCase("api")) {
            try {
                MonteScreenRecorder.startRecord(method.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
