package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.CSS, using = "div[class='dashboard-header']")
    public WebElement head_welComeToGrafana;

    @FindBy(how = How.XPATH, using = "//h1[@class='css-ke7iqf']")
    public List<WebElement> list_StepProgress;
}
