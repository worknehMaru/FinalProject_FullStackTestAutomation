package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewUserPage {
    @FindBy(how = How.NAME, using = "name")
    public WebElement txt_name;

    @FindBy(how = How.NAME, using = "email")
    public WebElement txt_email;

    @FindBy(how = How.NAME, using = "login")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//span[@class='css-1mhnkuh']")
    public WebElement btn_createUser;
}
