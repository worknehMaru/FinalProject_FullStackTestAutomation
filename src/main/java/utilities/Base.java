package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObject.grafana.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

      //General
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;

    //Web
    protected static WebDriver driver;

    //Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //DB
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;



    //Rest API
    protected static RequestSpecification httpRequest;
    protected  static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;


    //Page Objects
    protected static LoginPage grafanaLogin;
    protected static pageObject.grafana.MainPage  grafanaMainPage;
    protected static LeftMenuPage grafanaLeftMenuPage;
    protected static ServerAdminMenuPage grafanaServerAdminMenuPage;
    protected static ServerAdminMainPage grafanaServerAdminMainPage;
    protected static AddNewUserPage grafanaAddNewUserPage;
    protected static EditUserPage grafanaEditUserPage;

    //Page Object Mobile
    protected static pageObject.mortgage.MainPage mortgageMainPage;

    //Page Objects - Electron
    protected static pageObject.todoListApp.MainPage todoListMainPage;

    // Page Objects - Desktop App
    protected static pageObject.CalculatorApp.MainPage calcMainPage;


}
