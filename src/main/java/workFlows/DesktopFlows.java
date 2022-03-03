package workFlows;

import exensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class DesktopFlows extends CommonOps {
    @Step("Calculate Addition: 1 + 8")
    public static void calculateAddition(){
        UIActions.click(calcMainPage.getBtn_clear());
        UIActions.click(calcMainPage.getBtn_one());
        UIActions.click(calcMainPage.getBtn_plus());
        UIActions.click(calcMainPage.getBtn_eight());
        UIActions.click(calcMainPage.getBtn_equals());
        UIActions.click(calcMainPage.getFiled_results());
    }
}
