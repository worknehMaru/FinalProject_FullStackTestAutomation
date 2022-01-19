package Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.tools.ant.taskdefs.Get;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import utilities.CommonOps;

public class TempAPI  {
    RequestSpecification httpRequest;
    Response response;
    String url = "http://localhost:3000/";

    @Test
    public void testingAPI() {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given()
                .auth()
                .preemptive()
                .basic("admin", "admin");

//        //Get Request;
          response =httpRequest.get("api/teams/search");
//        //System.out.println(response.getBody().asString());
         response.prettyPrint();

       //Post + Put request from the server
//        JSONObject params = new JSONObject();
//        params.put("name", "ATeam");
//        params.put("email", "ATemail@gmail.com");
//        httpRequest.header("Content-Type", "application/json");
//        httpRequest.body(params.toJSONString());
//        response = httpRequest.post("/api/teams");
       // response = httpRequest.put("/api/teams");

//        response = httpRequest.put("/api/teams/3");
//        response = httpRequest.delete("/api/teams/2");
        response.prettyPrint();
    }
}


