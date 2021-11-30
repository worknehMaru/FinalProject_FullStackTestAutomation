package exensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {
    @Step("Click on element")
    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("Update Text Element")
    public static void updateText(WebElement elem, String text) {

        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }
    @Step("Update DropDown element")
    public static void updateDropDown(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropdown = new Select(elem);
        dropdown.selectByVisibleText(text);
    }
    @Step("Mouse Hover Element ")
    public static void mouseHover(WebElement elm1, WebElement elem2){
        action.moveToElement(elm1).moveToElement(elem2).click().build().perform();
    }
}
