package exensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.CommonOps;

public class ApiActions extends CommonOps {
    @Step("Get Data From Server")
    public static Response get(String paramsValues){
        response =httpRequest.get(paramsValues);
        response.prettyPrint();
        return response;
    }
    @Step("Extract Value from JSON Format")
    public static String extractFromJSON(Response response, String path){
        jp = response.jsonPath();
        return jp.get(path).toString();
    }
    @Step("Post Data to Server")
    public static void post(JSONObject params, String resource) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        response.prettyPrint();
    }

    @Step("update Data in Server")
    public static void put(JSONObject params, String resource) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        response.prettyPrint();
    }

    @Step("delete team Data from Server")
    public static void delete(String id) {
        response = httpRequest.delete("/api/teams/" + id);
        response.prettyPrint();
    }
}
