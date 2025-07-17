package by.edostavka;

import static io.restassured.RestAssured.given;

public class SearchPage {

    public String doSearch(String query) {
        return given()
                .queryParam("query", query)
                .when().get("https://edostavka.by/search").then()
                .extract()
                .response()
                .body()
                .asString();
    }
}
