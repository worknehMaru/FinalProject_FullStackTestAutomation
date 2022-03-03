package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

   /*
    #####################################################################################
    This class include  elements from the Login page of Grafana App
    and it will develop with another elements that has for grafana to offer
    #####################################################################################
     */
public class LoginPage {
    @FindBy(how = How.NAME, using = "user")
    private WebElement txt_username;

    @FindBy(how = How.CSS, using = "input[placeholder='password']")
    private WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    private WebElement btn_login;

    @FindBy(how = How.CSS, using = "a[aria-label='Skip change password button']")
    private WebElement btn_skip;

     /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

       public WebElement getTxt_username(){
           return txt_username;
       }

       public WebElement getTxt_password(){
           return txt_password;
       }

       public WebElement getBtn_login(){
           return btn_login;
       }

       public WebElement getBtn_skip(){
           return btn_skip;
       }

}

