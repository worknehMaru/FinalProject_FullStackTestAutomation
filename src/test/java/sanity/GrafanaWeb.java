package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import exensions.UIActions;
import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;


@Listeners(utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test01 - Verify Header")
    @Description("This Test Login and verifies the main Header")
    public void test01_VerifyHeader(){
        WebFlows.login("admin", "admin");
        Verifications.verifyDashboardHeader(grafanaMainPage.head_welComeToGrafana, "Welcome to Grafana");
    }
    @Test(description = "Test02 - Default Users")
    @Description("This Test Verifies the Default users ")
    public void test02_DefaultUsers(){
        UIActions.mouseHover(grafanaLeftMenu.btn_server,grafanaServerAdminMenuPage.link_users);
        Verifications.numbersOfElements(grafanaServerAdminMainPage.rows, 9090);
    }
    @Test(description = "Test03 - Verify Created NewUser")
    @Description("This Test Verifies if the user is created  ")
    public void test03_VerifyCreatedNewUser(){
        UIActions.mouseHover(grafanaLeftMenu.btn_server,grafanaServerAdminMenuPage.link_users);
        WebFlows.createNewUser("maru", "maru@gmail.com", "maruG-unite", "1234");
        Verifications.numbersOfElements(grafanaServerAdminMainPage.rows, 2);
    }
    @Test(description = "Test04 - Verify User Deletion")
    @Description("This Test Verifies if the user is deleted  ")
    public void test04_VerifyUserDeletion() {
        UIActions.mouseHover(grafanaLeftMenu.btn_server, grafanaServerAdminMenuPage.link_users);
        WebFlows.deleteLastUser();
        Verifications.numbersOfElements(grafanaServerAdminMainPage.rows, 1);
    }
    @Test(description = "Test05 - verify Progress Steps")
    @Description("This Test Verifies the default progress are displayed ( using soft assertion")
    public void Test05_verifyStepsProgress(){
        Verifications.visibilityOfElements(grafanaMainPage.list_StepProgress);
    }
}
