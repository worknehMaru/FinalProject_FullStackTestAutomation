package pageObject.todoListApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy(how = How.CSS, using = "input[placeholder='Create a task']")
    private WebElement txt_createTask;

    @FindBy(how = How.XPATH, using = "//div[@class='view_2Ow90']")
    private List<WebElement> list_tasks;

    @FindBy(how = How.CLASS_NAME, using = "destroy_19w1q")
    private WebElement btn_DeleteTaskButton;

     /*
    ########################################################################################
    The get element method for possible to use those elements in other class
    cause the elements name suppose be private and not a public
    ########################################################################################
     */

    public List<WebElement> getList_tasks(){
        return list_tasks;
    }

    public WebElement getBtn_DeleteTaskButton(){
        return  btn_DeleteTaskButton;
    }

    public WebElement getTxt_createTask(){
        return txt_createTask;
    }

}

