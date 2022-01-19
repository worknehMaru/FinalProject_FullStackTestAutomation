package exensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

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

    @Step("Update Text Element as human")
    public static void updateTextHuman(WebElement elem, String text) {
         wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch: text.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
            //elem.sendKeys(ch + "");
            elem.sendKeys(String.valueOf(ch).replaceAll("[^a-zA-Z ]", ""));
            wait.until(ExpectedConditions.visibilityOf(elem));
        }
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
    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1){
        action.moveToElement(elem1).click().build().perform();
    }
    @Step("Insert key")
    public static void insertKey(WebElement elem, Keys value ){
        elem.sendKeys(value);

    }
}
