package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
    #####################################################################################
    This class include the elements of the add new user page
    #####################################################################################
     */
public class AddNewUserPage {
    @FindBy(how = How.NAME, using = "name")
    private WebElement txt_name;

    @FindBy(how = How.NAME, using = "email")
    private WebElement txt_email;

    @FindBy(how = How.NAME, using = "login")
    private WebElement txt_userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[class='css-1emkf9f-button']")
    private WebElement btn_createUser;

     /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public WebElement getTxt_name(){
        return txt_name;
    }

    public WebElement getTxt_email(){
        return txt_email;
    }

    public WebElement getTxt_userName(){
        return txt_userName;
    }

    public WebElement getTxt_password(){
        return txt_password;
    }

    public WebElement getBtn_createUser(){
        return btn_createUser;
    }



    




}
