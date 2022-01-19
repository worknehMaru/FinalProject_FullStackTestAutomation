package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage {
    @FindBy(how = How.XPATH, using = "//a[@href='/admin/users']")
    public WebElement link_users;

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/teams']")
    public WebElement link_teams;

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/plugins']")
    public WebElement link_plugins;

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/orgs']")
    public WebElement link_orgs;
}
