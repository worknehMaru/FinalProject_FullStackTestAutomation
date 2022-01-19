package sanity;

import exensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.ApiFlows;

@Listeners(utilities.Listeners.class)
public class GrafanaAPI extends CommonOps{
    @Test(description = "Test 01: Get team from Grafana")
    @Description("This Test verify Tam Property")
    public void test01_verifyTeam(){

        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"),"ATeam");
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].email"),"ATemail@gmail.com");
    }
    //Add Team by using Post method and verify
    @Test(description = "Test 02:Add New Team and Verify ")
    @Description("This Test Adds a team to grafana and verify it")
    public void Test02_addNewTeamAndVerify() {
        ApiFlows.postTeam("maruTeam2", "maru2@gmail.com");
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[1].name"), "maruTeam2");
    }

    //Update Team by using Put method and verify
    @Test(description = "Test 03: Update exist Team and verify")
    @Description("This Test  is update the Team data and verify it")
    public void Test03_updateTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.updateTeam("maruTeam2", "workneh.matherFucker@gmail.com", id );
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[1].email"), "workneh.matherFucker@gmail.com");
    }

    @Test(description = "Test 04: delete exist Team and verify")
    @Description("This Test  is delete the Team data and verify it")
    public void Test04_deleteTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.deleteTeam(id);
        Verifications.verifyText(ApiFlows.getTeamProperty("totalCount"), "1");
    }
}
