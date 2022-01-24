package workFlows;

import exensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class DesktopFlows extends CommonOps {
    @Step("Calculate Addition: 1 + 8")
    public static void calculateAddition(){
        UIActions.click(calcMainPage.btn_clear);
        UIActions.click(calcMainPage.btn_one);
        UIActions.click(calcMainPage.btn_plus);
        UIActions.click(calcMainPage.btn_eight);
        UIActions.click(calcMainPage.btn_equals);
    }
}
