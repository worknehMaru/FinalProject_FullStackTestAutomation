package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage {
    @FindBy(how = How.XPATH, using = "//a[@href='/admin/users']")
    private WebElement link_users;

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/teams']")
    private WebElement link_teams;

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/plugins']")
    private WebElement link_plugins;

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/orgs']")
    private WebElement link_orgs;


     /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public WebElement getLink_users(){
        return link_users;
    }

    public WebElement getLink_teams(){
        return link_teams;
    }

    public WebElement getLink_plugins(){
        return link_plugins;
    }

    public WebElement getLink_orgs(){
        return link_orgs;
    }

}
