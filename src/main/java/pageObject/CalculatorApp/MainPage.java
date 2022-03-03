package pageObject.CalculatorApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;


/*
    #####################################################################################
    This class include  elements from the main page of calculator App
    and it will develop with another elements that has for calculator to offer
    #####################################################################################
     */
public class MainPage extends CommonOps {
    @FindBy(how = How.NAME, using = "One")
    private WebElement btn_one;

    @FindBy(how = How.NAME, using = "Eight")
    private WebElement btn_eight;

    @FindBy(how = How.NAME, using = "Plus")
    private WebElement btn_plus;

    @FindBy(how = How.NAME, using = "Equals")
    private WebElement btn_equals;

    @FindBy(how = How.NAME, using = "Clear")
    private WebElement btn_clear;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    private WebElement Filed_results;
    /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public WebElement getBtn_one(){
        return btn_one;
    }

    public  WebElement getBtn_eight(){
        return btn_eight;
    }

    public WebElement getBtn_plus(){
        return btn_plus;
    }

    public WebElement getBtn_equals(){
        return btn_equals;
    }

    public WebElement getFiled_results(){
        return Filed_results;
    }

    public WebElement getBtn_clear(){
        return btn_clear;
    }


}
