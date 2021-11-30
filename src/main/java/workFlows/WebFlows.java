package workFlows;
import exensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class WebFlows extends CommonOps {
    @Step("Business Flow : Log in")
    public static void login(String user, String password){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, password);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }
    @Step("Business Flow : Create  New User")
    public static void createNewUser(String name, String email, String userName, String password)
    {
        UIActions.click(grafanaServerAdminMainPage.btn_newUser);
        UIActions.updateText(grafanaAddNewUserPage.txt_name, name);
        UIActions.updateText(grafanaAddNewUserPage.txt_email, email);
        UIActions.updateText(grafanaAddNewUserPage.txt_userName, userName);
        UIActions.updateText(grafanaAddNewUserPage.txt_password, password);
        UIActions.click(grafanaAddNewUserPage.btn_createUser);
    }
    @Step("Business Flow : Delete Last User")
    public static void deleteLastUser(){
        UIActions.click(grafanaServerAdminMainPage.rows.get(grafanaServerAdminMainPage.rows.size()-1));
        UIActions.click(grafanaEditUserPage.btn_deleteUser);
        UIActions.click(grafanaEditUserPage.btn_confirmDeleteUser);

    }
}

