package pageObject.mortgage;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {

    private AppiumDriver mobileDriver;

    public MainPage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
       // PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, 3, TimeUnit.SECONDS), this);
    }
    @AndroidFindBy(id = "etAmount")
    public MobileElement txt_amount;

    @AndroidFindBy(id = "etTerm")
    public MobileElement txt_term;

    @AndroidFindBy(id = "etRate")
    public MobileElement txt_rate;

    @AndroidFindBy(id = "btnCalculate")
    public MobileElement btn_calculate;

    @AndroidFindBy(id = "tvRepayment")
    public WebElement txt_repayment;

    @AndroidFindBy(id = "tvInterestOnly")
    public WebElement txt_interestOnly;
}
