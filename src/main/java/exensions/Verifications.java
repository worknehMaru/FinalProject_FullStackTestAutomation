package exensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.CommonOps;

import java.util.List;

public class Verifications extends CommonOps {
    @Step("Verify Dashboard Header")
    public static void verifyDashboardHeader(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getText(), expected);
    }
    @Step("Verify Numbers of Elements ")
    public static void numbersOfElements(List<WebElement> elems, int expected ) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        Assert.assertEquals(elems.size(),expected);
    }
    @Step("Verify Visibility of Elements ( Soft Assertion)")
    public  static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem: elems){
            softAssert.assertTrue(elem.isDisplayed(), " Sorry " +elem.getText() + " not exist");
        }
        softAssert.assertAll("some elements are not displayed ");

    }
}
