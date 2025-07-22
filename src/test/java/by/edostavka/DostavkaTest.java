package by.edostavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DostavkaTest {


    @Test
    public void test() {
        String search = "сникерс";
        SearchPage searchPage = new SearchPage();
        String body = searchPage.doSearch(search);

        Assertions.assertTrue(body.contains(search), "по запросу" + search + "не найден");
    }
}
