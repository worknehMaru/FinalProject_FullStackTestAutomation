package workFlows;

import exensions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ApiFlows extends CommonOps {
    @Step("Business Flow: Get Team Property")
    public static String getTeamProperty(String jpath){
        response = ApiActions.get("api/teams/search");
        return ApiActions.extractFromJSON(response, jpath);
    }

    //Add new Team by using by Post method
    @Step("Business Flow: Post new Team to the Server")
    public static void postTeam(String name, String email) {
        params.put("name", name);
        params.put("email", email);
        ApiActions.post(params, "/api/teams");
    }
    //Update team by using Put Method
    @Step("Business Flow: update the exist team  in the Grafana Server")
    public static void updateTeam(String name, String email, String id) {
        params.put("name", name);
        params.put("email", email);
        ApiActions.put(params, "/api/teams/" + id);
    }
    //delete team data from server by using delete Method
    @Step("Business Flow:delete team data from server by using delete Method")
    public static void deleteTeam(String id){
        ApiActions.delete(id);
    }
}
