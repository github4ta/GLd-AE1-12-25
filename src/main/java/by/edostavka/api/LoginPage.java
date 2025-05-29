package by.edostavka.api;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class LoginPage {

    private final Response response;
    private final String DEFAULT_PHONE = "";
    private final String DEFAULT_PASSWORD = "qwerty";

    public LoginPage() {
        response = getResponse();
    }

    public LoginPage(String phone, String password){
        response = getResponse(phone, password);
    }

    private Response getResponse() {
        Response response = given()
                .header("apitoken", "4Pg2vLanS2Zdb9Pa2SAdZxEUPdNBEpiE")
                .header("web-user-agent", "SiteEdostavka/1.0.0")
                .header("content-type", "application/json")
                .body("{\"phone\":\"\",\"password\":\"qwerty\"}")
                .when().post("https://api2.edostavka.by/api/v2/auth");
        return getResponse("", "qwerty");
    }

    private Response getResponse(String phone, String password) {
        Response response = given()
                .header("apitoken", "4Pg2vLanS2Zdb9Pa2SAdZxEUPdNBEpiE")
                .header("web-user-agent", "SiteEdostavka/1.0.0")
                .header("content-type", "application/json")
                .body("{\"phone\":\"" + phone + "\",\"password\":\"" + password + "\"}")
                .when().post("https://api2.edostavka.by/api/v2/auth");
        return response;
    }

    public int getStatusCode() {
        Response response = getResponse();
        return response.getStatusCode();
    }

    public String getInvalidField() {
        Response response = getResponse();
        return response.path("invalidField[0]");
    }

    public  String getMessage(){
        return response.path("message[0]");
    }
}
