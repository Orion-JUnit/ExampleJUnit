package automation.reverb.tests;

import automation.reverb.config.TestConfig;
import automation.reverb.utils.ReverbAPIClient;
import automation.reverb.assertions.ReverbAssertions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("DirHealthCheck")
class ReverbListingsTest extends TestConfig {

    private final ReverbAPIClient reverbAPIClient = new ReverbAPIClient();

    static void setupBaseUri() {
        RestAssured.baseURI = "https://api.reverb.com";
    }

    @Test
    @Order(1)
    @DisplayName("Verify Recently Featured Articles Endpoint")
    void testRecentlyFeaturedArticles() {
        Response response = reverbAPIClient.getRecentlyFeaturedArticles();
        ReverbAssertions.assertFeaturedArticles(response);
    }

    @Test
    @Order(2)
    @DisplayName("Sell Gear button leads to Sell Page")
    void testSellGearRedirectsToSellPage() {
        Response response = reverbAPIClient.getSellPage();
        ReverbAssertions.assertSellPageLoaded(response);
    }

    @Test
    @Order(3)
    @DisplayName("Validate Sell Page title")
    void testSellPageTitleFrom() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" " +
                "\"http://www.w3.org/TR/html4/strict.dtd\">\n" +
                "<html class='' data-theme='web2' lang='en' xml:lang='en' xmlns='http://www.w3.org/1999/xhtml'>\n" +
                "<head>\n" +
                "<title>Sell Musical Instruments on Reverb | Reverb</title>\n";

        ReverbAssertions.assertSellPageTitle(html);
    }
}