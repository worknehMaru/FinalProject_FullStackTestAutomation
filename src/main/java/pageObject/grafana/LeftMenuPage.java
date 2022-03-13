package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {
    @FindBy(how = How.XPATH, using = "//div[@class='sidemenu-item dropdown'][4]")
    private WebElement btn_alerting;

    @FindBy(how = How.XPATH, using = "//div[@class='sidemenu-item dropdown'][5]")
    private WebElement btn_configuration;

    @FindBy(how = How.XPATH, using = "//div[@class='sidemenu-item dropdown'][6]")
    private WebElement btn_server;

      /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public WebElement getBtn_alerting(){
        return btn_alerting;
    }

    public WebElement getBtn_configuration(){
        return btn_configuration;
    }

    public WebElement getBtn_server(){
        return  btn_server;
    }
}
