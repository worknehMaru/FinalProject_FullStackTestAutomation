package workFlows;

import exensions.DBActions;
import exensions.UIActions;
import exensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;

public class WebFlows extends CommonOps {
    @Step("Business Flow : Log in")
    public static void login(String user, String password){
        UIActions.updateText(grafanaLogin.getTxt_username(), user);
        UIActions.updateText(grafanaLogin.getTxt_password(), password);
        UIActions.click(grafanaLogin.getBtn_login());
        UIActions.click(grafanaLogin.getBtn_skip());
    }
    @Step("Business Flow : Create  New User")
    public static void createNewUser(String name, String email, String userName, String password)
    {
        UIActions.click(grafanaServerAdminMainPage.btn_newUser);
        UIActions.updateText(grafanaAddNewUserPage.getTxt_name(), name);
        UIActions.updateText(grafanaAddNewUserPage.getTxt_email(), email);
        UIActions.updateText(grafanaAddNewUserPage.getTxt_userName(), userName);
        UIActions.updateText(grafanaAddNewUserPage.getTxt_password(), password);
        UIActions.click(grafanaAddNewUserPage.getBtn_createUser());
    }

    //DataBase
    @Step("Log in to grafana with DB credentials")
    public static void loginDB(){
        String query = "SELECT name, password FROM Employees1 WHERE id='3'";
        List<String> cred = DBActions.credentials(query);
        UIActions.updateText(grafanaLogin.getTxt_username(), cred.get(0));
        UIActions.updateText(grafanaLogin.getTxt_password(), cred.get(1));
        UIActions.click(grafanaLogin.getBtn_login());
        UIActions.click(grafanaLogin.getBtn_skip());
    }
    @Step("Business Flow : Delete Last User")
    public static void deleteLastUser(){
        UIActions.click(grafanaServerAdminMainPage.rows.get(grafanaServerAdminMainPage.rows.size()-1));
        UIActions.click(grafanaEditUserPage.getBtn_deleteUser());
        UIActions.click(grafanaEditUserPage.getBtn_confirmDeleteUser());
    }

    @Step("Business flow: Search and verify User")
    public static void SearchAndVerifyUser(String user, String shouldExist){
        UIActions.updateTextHuman(grafanaServerAdminMainPage.txt_searchUserFiled,  user);
        if (shouldExist.equalsIgnoreCase("exist"))
            Verifications.ExistenceOfElement(grafanaServerAdminMainPage.rows);
        else if (shouldExist.equalsIgnoreCase("not exist"))
            Verifications.NonExistenceOfElement(grafanaServerAdminMainPage.rows);
        else
            throw new RuntimeException(("Invalid expected out put in data driven testing, should be exist or not exist"));
    }
}

