package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.CSS, using = "div[class='dashboard-header']")
    private WebElement head_welComeToGrafana;

    @FindBy(how = How.XPATH, using = "//h1[@class='css-ke7iqf']")
    private List<WebElement> list_StepProgress;


      /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */


    public  WebElement getHead_welComeToGrafana(){
        return head_welComeToGrafana;
    }
     public List<WebElement> getList_StepProgress(){
        return list_StepProgress;
     }

}
