package exensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.fail;

public class Verifications extends CommonOps {
    @Step("Verify Text in Element ")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getText(), expected);
    }

    @Step("Verify Numbers of Elements ")
    public static void numbersOfElements(List<WebElement> elems, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() -1)));
        Assert.assertEquals(elems.size(), expected);
    }

    @Step("Verify Visibility of Elements ( Soft Assertion)")
    public static void visibilityOfElements(List<WebElement> elems) {
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), " Sorry " + elem.getText() + " not exist");
        }
        softAssert.assertAll("some elements are not displayed ");
    }

    @Step("Verify Element Visually of grafana Avatar")
    public static void visualElement(String expectedImageName) {
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File:" + findFailed);
            fail("Error Comparing Image File:" + findFailed);
        }
    }

    @Step("Verify Element Displayed")
    public static void ExistenceOfElement(List<WebElement> elements) {
        Assert.assertTrue(elements.size() > 0);
    }

    @Step("Verify Element  Not Displayed")
    public static void NonExistenceOfElement(List<WebElement> elements) {
        Assert.assertFalse(elements.size() > 0);
    }
    @Step("Verify Text with Text")
    public static void verifyText(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }
    //For electron To do List Number
    @Step("Verify Task number")
    public static void verifyNumber(int actual, int expected) {
        Assert.assertEquals(actual, expected);
    }
}
