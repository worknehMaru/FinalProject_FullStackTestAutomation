package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {
    @FindBy(how = How.XPATH, using = "//td[@class='width-4 text-center link-td']")
    public List<WebElement> rows;

    @FindBy(how = How.XPATH, using = "//a[@class='css-aja5tg-button']")
    public WebElement btn_newUser;
}
