package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {
    @FindBy(how = How.CSS, using = "tr[ng-repeat='user in ctrl.users']")
    private List<WebElement> rows;

    @FindBy(how = How.CSS, using = "a[class='btn btn-primary']")
    private WebElement btn_newUser;

    @FindBy(how = How.CSS, using = "input[ng-change='ctrl.getUsers()'")
    private WebElement txt_searchUserFiled;

      /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public  List<WebElement> getRows(){
        return rows;
    }

    public WebElement getBtn_newUser(){
        return btn_newUser;
    }

    public WebElement getTxt_searchUserFiled(){
        return txt_searchUserFiled;
    }
}

