package automation.reverb.utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReverbAPIClient {

    public Response getRecentlyFeaturedArticles() {
        return given()
                .header("accept", "*/*")
                .header("accept-version", "3.0")
                .header("x-display-currency", "USD")
                .when()
                .get("/api/articles/recently_featured")
                .then()
                .extract()
                .response();
    }

    public Response getSellPage() {
        return given()
                .when()
                .get("/sell/search")
                .then()
                .extract()
                .response();
    }
}