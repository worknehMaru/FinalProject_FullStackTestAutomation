package workFlows;

import exensions.UIActions;
import utilities.CommonOps;

public class DesktopFlows extends CommonOps {
    public static void calculateAddition(){
        UIActions.click(calcMainPage.btn_clear);
        UIActions.click(calcMainPage.btn_one);
        UIActions.click(calcMainPage.btn_plus);
        UIActions.click(calcMainPage.btn_eight);
        UIActions.click(calcMainPage.btn_equals);
    }
}
