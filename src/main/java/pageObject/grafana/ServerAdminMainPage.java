package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {
    @FindBy(how = How.CSS, using = "tr[ng-repeat='user in ctrl.users']")
    public List<WebElement> rows;

    @FindBy(how = How.CSS, using = "a[class='btn btn-primary']")
    public WebElement btn_newUser;

    @FindBy(how = How.CSS, using = "input[ng-change='ctrl.getUsers()'")
    public WebElement txt_searchUserFiled;
}

