package automation.reverb.assertions;

import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.assertThat;

public class ReverbAssertions {

    public static void assertSuccessfulListingSearch(Response response) {
        assertThat(response.statusCode())
                .as("Expecting HTTP status 200 for successful listings search.")
                .isEqualTo(200);

        assertThat(response.jsonPath().getList("listings"))
                .as("Listings should not be empty.")
                .isNotEmpty();
    }

    public static void assertEmptyListingSearch(Response response) {
        assertThat(response.statusCode())
                .as("Expecting HTTP status 200 even if no listings are found.")
                .isEqualTo(200);

        assertThat(response.jsonPath().getList("listings"))
                .as("Listings should be empty for invalid queries.")
                .isEmpty();
    }
}