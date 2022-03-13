package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {
    @FindBy(how = How.CSS, using = "button[class='css-1o8xzkc-button']")
    private WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "div:nth-child(1) > button > span")
    private WebElement btn_confirmDeleteUser;

      /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public WebElement getBtn_deleteUser(){
        return btn_deleteUser;
    }

    public WebElement getBtn_confirmDeleteUser(){
        return btn_confirmDeleteUser;
    }
}
