package automation.reverb.tests;

import automation.reverb.config.TestConfig;
import automation.reverb.utils.ReverbAPIClient;
import automation.reverb.assertions.ReverbAssertions;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

class ReverbListingsTest extends TestConfig {

    @Test
    void testSearchListingsReturnsResults() {
        Response response = ReverbAPIClient.searchListings("Fender Stratocaster");
        ReverbAssertions.assertSuccessfulListingSearch(response);
    }

    @Test
    void testSearchListingsInvalidQuery() {
        Response response = ReverbAPIClient.searchListings("invalidquerythatshouldreturnzeroresults");
        ReverbAssertions.assertEmptyListingSearch(response);
    }
}