package automation.reverb.utils;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ReverbAPIClient {

    public static Response searchListings(String query) {
        return given()
                .queryParam("query", query)
                .when()
                .get("/listings")
                .then()
                .extract()
                .response();
    }

    // Add more API methods as needed
}