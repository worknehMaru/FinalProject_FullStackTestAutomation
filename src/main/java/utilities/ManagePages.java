package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObject.grafana.AddNewUserPage;

public class ManagePages extends Base  {

    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObject.grafana.LoginPage.class);
        grafanaMainPage = PageFactory.initElements(driver, pageObject.grafana.MainPage.class);
        grafanaLeftMenu = PageFactory.initElements(driver, pageObject.grafana.LeftMenuPage.class );
        grafanaServerAdminMenuPage = PageFactory.initElements(driver, pageObject.grafana.ServerAdminMenuPage.class);
        grafanaServerAdminMainPage = PageFactory.initElements(driver, pageObject.grafana.ServerAdminMainPage.class);
        grafanaAddNewUserPage = PageFactory.initElements(driver, AddNewUserPage.class);
        grafanaEditUserPage = PageFactory.initElements(driver, pageObject.grafana.EditUserPage.class);

    }
}
