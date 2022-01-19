package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {
    public void onStart(ITestContext execution) {
        System.out.println("---------------Starting Execution------------------");
    }

    public void onFinish(ITestContext execution) {
        System.out.println("---------------Ending Execution------------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO implement this....
    }

    public void onTestSkipped(ITestResult test) {
        System.out.println("-------------------Skipping Test:" + test.getName() + "----------------");
    }

    public void onTestStart(ITestResult test) {
        System.out.println("-------------------Starting  Test:" + test.getName() + "----------------");
    }

    public void onTestSuccess(ITestResult test) {
        System.out.println("------------ Test: " + test.getName() + " Passed ------------" + test.getName());
        if (!getData("PlatformName").equalsIgnoreCase("api"))
            //Stop recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
        //delete recorded file

        File file = new File("./test-recordings/" + test.getName() + ".avi");
        if (file.delete())
            System.out.println("File Deleted Successfully");
        else
            System.out.println("Failed to Delete File");
    }

    public void onTestFailure(ITestResult test) {
        System.out.println("------------ Test " + test.getName() + " Failed, ------------");
        if (!getData("PlatformName").equalsIgnoreCase("api"))
            //Stop Recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
        saveScreenshot();
    }

    //Taking screenshot when the test fail
    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenshot() {
        if (!getData("PlatformName").equalsIgnoreCase("mobile"))
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        //when I need run Mobile Test cases i need to delete line 69
        return new byte[0];
    }
//        else
        //return((TakesScreenshot)mobileDriver).getScreenshotAs(OutputType.BYTES);
    }


