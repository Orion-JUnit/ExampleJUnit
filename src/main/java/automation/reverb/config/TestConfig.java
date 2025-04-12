package automation.reverb.config;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class TestConfig {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://api.reverb.com/api";
        // Uncomment and add OAuth token if needed:
        // RestAssured.authentication = RestAssured.oauth2("YOUR_TOKEN");
    }
}