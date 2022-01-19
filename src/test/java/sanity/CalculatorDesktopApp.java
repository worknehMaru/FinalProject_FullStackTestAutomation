package sanity;

import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.DesktopFlows;

@Listeners(utilities.Listeners.class)
public class CalculatorDesktopApp extends CommonOps {
    @Test(description = "Test 01: Verify Addition Command")
    @Description("This Test verify The Addition Command")
    public void test01_verifyAdditionCommand(){
        DesktopFlows.calculateAddition();
        Verifications.verifyTextInElement(calcMainPage.Filed_results, "9");
    }
}
