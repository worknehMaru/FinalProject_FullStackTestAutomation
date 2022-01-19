package workFlows;

import exensions.MobileActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class MobileFlows extends CommonOps {
    @Step(" Business Flow : Fill form and calculate mortgage")
    public static void calculateMortgage(String amount, String term, String rate){
        MobileActions.updateText(mortgageMainPage.txt_amount,amount);
        MobileActions.updateText(mortgageMainPage.txt_term, term);
        MobileActions.updateText(mortgageMainPage.txt_rate,rate);
        MobileActions.tap(1,mortgageMainPage.btn_calculate, 600);
    }
}
