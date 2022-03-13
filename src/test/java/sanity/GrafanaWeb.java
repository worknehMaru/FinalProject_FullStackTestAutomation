package sanity;

import exensions.UIActions;
import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;


@Listeners(utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test01 - Verify Header", priority = 1)
    @Description("This Test Login and verifies the main Header")
    public void test01_VerifyHeader()
    {
        WebFlows.login(getData("UserName"), getData("PassWord"));
        Verifications.verifyTextInElement(grafanaMainPage.head_welComeToGrafana, "Welcome to Grafana");
    }
    @Test(description = "Test02 - Default Users", priority = 2)
    @Description("This Test Verifies the Default users ")
    public void test02_DefaultUsers()
    {
        UIActions.mouseHover(grafanaLeftMenuPage.getBtn_server(),grafanaServerAdminMenuPage.link_users);
        Verifications.numbersOfElements(grafanaServerAdminMainPage.rows, 1);
    }
    @Test(description = "Test03 - Verify Created NewUser", priority = 3)
    @Description("This Test Verifies if the user is created  ")
    public void test03_VerifyCreatedNewUser()
    {
        UIActions.mouseHover(grafanaLeftMenuPage.getBtn_server(),grafanaServerAdminMenuPage.link_users);
        WebFlows.createNewUser("maru", "maru@gmail.com", "maruG-unite", "1234");
        Verifications.numbersOfElements(grafanaServerAdminMainPage.rows, 2);
    }
    @Test(description = "Test04 - Verify User Deletion", priority = 4)
    @Description("This Test Verifies if the user is deleted  ")
    public void test04_VerifyUserDeletion()
    {
        UIActions.mouseHover(grafanaLeftMenuPage.getBtn_server(), grafanaServerAdminMenuPage.link_users);
        WebFlows.deleteLastUser();
        Verifications.numbersOfElements(grafanaServerAdminMainPage.rows, 1);
    }
    @Test(description = "Test05 - verify Progress Steps", priority = 5)
    @Description("This Test Verifies the default progress are displayed ( using soft assertion")
    public void Test05_verifyStepsProgress()
    {
        Verifications.visibilityOfElements(grafanaMainPage.list_StepProgress);
    }
    @Test(description = "Test06 - verify Avatar Icon", priority = 6)
    @Description("This Test Verifies the Avatar Image Using Sikuli tool")
    public void Test06_verifyAvatarIcon()
    {
        Verifications.visualElement("GrafanaAvatar");
    }
    @Test(description = "Test07- Verify searchUser", dataProvider = "data-provider-users", dataProviderClass = utilities.ManageDDT.class, priority = 7)
    @Description("This Test verifies Search user  by using data driven Testing ")
    public void Test07_verifySearchUser(String user, String shouldExist)
    {
        UIActions.mouseHover(grafanaLeftMenuPage.getBtn_server(), grafanaServerAdminMenuPage.link_users);
        WebFlows.SearchAndVerifyUser(user, shouldExist);
    }
}
