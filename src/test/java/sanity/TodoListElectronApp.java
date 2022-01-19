package sanity;

import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class TodoListElectronApp extends CommonOps {
    @Test(description = "Test01 - Add and Verify New Task")
    @Description("This Test adds a new Task and Verifies it the list of tasks")
    public void test01_addAndVerifyNewTask()
    {
        ElectronFlows.addNewTask("Learn Java");
       Verifications.verifyNumber(ElectronFlows.getNumberOFTask(),1);

    }

    @Test(description = "Test02 - Add and Verify New Task")
    @Description("This Test adds a new Task and Verifies it the list of tasks")
    public void test02_addAndVerifyNewTasks()
    {
        ElectronFlows.addNewTask("Lean How to Fuck the system");
        ElectronFlows.addNewTask("Lean How to Develop Automation With Java");
        ElectronFlows.addNewTask("Lean C sharp");
//        ElectronFlows.addNewTask("Lean How To Read Amharic");
//        ElectronFlows.addNewTask("Lean Hebrew");
//        ElectronFlows.addNewTask("Lean Russian ");
//        ElectronFlows.addNewTask("Lean How war suit");
        Verifications.verifyNumber(ElectronFlows.getNumberOFTask(),4);
    }
}
