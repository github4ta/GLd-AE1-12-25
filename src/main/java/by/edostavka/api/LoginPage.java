package by.edostavka.api;

import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class LoginPage {

    private Response response;
    public LoginPage(){
        response = getResponse();
    }

    private Response getResponse() {
        Response response = given()
                .header("apitoken", "4Pg2vLanS2Zdb9Pa2SAdZxEUPdNBEpiE")
                .header("web-user-agent", "SiteEdostavka/1.0.0")
                .header("content-type", "application/json")
                .body("{\"phone\":\"\",\"password\":\"qwerty\"}")
                .when().post("https://api2.edostavka.by/api/v2/auth");
        return response;
    }

    public int getStatusCode(){
        Response response = getResponse();
        return response.getStatusCode();
    }

    public List<String> getInvalidField(){
        Response response = getResponse();
        return response.path("invalidField");
    }
}
