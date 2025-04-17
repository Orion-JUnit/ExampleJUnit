package automation.reverb.config;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class TestConfig {

    private static final String BASE_URL = "https://api.reverb.com";

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = BASE_URL;
    }
}