package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {
    @FindBy(how = How.CSS, using = "button[class='css-1o8xzkc-button']")
    public WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "div:nth-child(1) > button > span")
    public WebElement btn_confirmDeleteUser;
}
