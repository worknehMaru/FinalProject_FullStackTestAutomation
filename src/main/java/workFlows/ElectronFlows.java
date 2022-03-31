package workFlows;

import exensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {
    @Step("Add New Task to the List")
    public static void addNewTask(String taskName){
        UIActions.updateText(todoListMainPage.getTxt_createTask(), taskName);
        UIActions.insertKey(todoListMainPage.getTxt_createTask(), Keys.RETURN);
    }
    @Step("Count and Return Numbers of Task")
    public static int getNumberOFTask( ) {
       return todoListMainPage.getList_tasks().size();
    }

    @Step("Empty Lists from Tasks")
    public static void emptyList() {
        for (int i = 0; i < getNumberOFTask(); i++) {
            UIActions.mouseHover(todoListMainPage.getBtn_DeleteTaskButton());
        }
    }
}
