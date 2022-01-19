package sanity;

import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.MobileFlows;

@Listeners(utilities.Listeners.class)
public class MortgageMobile extends CommonOps {
    @Test(description = " Test01 - Verify Mortgage")
    @Description("This Test fill the mortgage fields and calculate the repayment")
    public void test01_verifyMortgage(){
        MobileFlows.calculateMortgage("1000","3","4");
        Verifications.verifyTextInElement(mortgageMainPage.txt_repayment, "£30.03");
        Verifications.verifyTextInElement(mortgageMainPage.txt_interestOnly, "£3.33");

    }
}
