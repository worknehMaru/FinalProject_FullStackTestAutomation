package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.CSS, using = "h1[class='css-1aanzv4']")
    public WebElement head_welComeToGrafana;

    @FindBy(how = How.XPATH, using = "//div[@class='css-ke7iqf']")
    public List<WebElement> list_StepProgress;
}
