package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pageObject.grafana.AddNewUserPage;


public class Base {
    protected  static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;

    //Pages Objects
    protected static pageObject.grafana.LoginPage grafanaLogin;
    protected static pageObject.grafana.MainPage  grafanaMainPage;
    protected static pageObject.grafana.LeftMenuPage grafanaLeftMenu;
    protected static pageObject.grafana.ServerAdminMenuPage grafanaServerAdminMenuPage;
    protected static pageObject.grafana.ServerAdminMainPage grafanaServerAdminMainPage;
    protected static pageObject.grafana.AddNewUserPage grafanaAddNewUserPage;
    protected static pageObject.grafana.EditUserPage grafanaEditUserPage;
}
