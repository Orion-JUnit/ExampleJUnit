package automation.reverb.assertions;

import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.assertThat;

public class ReverbAssertions {

    public static void assertFeaturedArticles(Response response) {
        assertThat(response.statusCode())
                .as("Expected HTTP status 200 for recently featured articles.")
                .isEqualTo(200);
    }

    public static void assertSellPageLoaded(Response response) {
        assertThat(response.getContentType())
                .as("Sell page should return HTML content.")
                .contains("text/html");
    }

    public static void assertSellPageTitle(String html) {
        assertThat(html)
                .as("Sell page should contain the correct <title>")
                .contains("<title>Sell Musical Instruments on Reverb");
    }
}