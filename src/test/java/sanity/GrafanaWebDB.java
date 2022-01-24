package sanity;

import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;

public class GrafanaWebDB extends CommonOps {
    @Test(description = "Test01- login to grafana with DB Credentials")
    @Description("This Test login with DB Credentials and verify the Main Header ")
    public void Test01_loginDBAndVerifyTitle() {
        WebFlows.loginDB();
        Verifications.verifyTextInElement(grafanaMainPage.head_welComeToGrafana, "Welcome to Grafana");
    }

}
