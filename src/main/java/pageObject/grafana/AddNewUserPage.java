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
    public WebElement txt_name;

    @FindBy(how = How.NAME, using = "email")
    public WebElement txt_email;

    @FindBy(how = How.NAME, using = "login")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[class='css-1emkf9f-button']")
    public WebElement btn_createUser;

     /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */




}
