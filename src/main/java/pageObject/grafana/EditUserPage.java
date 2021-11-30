package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {
    @FindBy(how = How.XPATH, using = "//*[@id='reactRoot']/div/main/div[3]/div/div[1]/div/div[2]/div[1]/div[2]/button[1]/span")
    public WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "div.css-g4isi4 > div > div:nth-child(2) > button > span")
    public WebElement btn_confirmDeleteUser;
}
