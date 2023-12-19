package examples;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * Retrieve country details - http://zippopotam.us/us/90210
 * {
 *     "post code": "90210",
 *     "country": "United States",
 *     "country abbreviation": "US",
 *     "places": [
 *         {
 *             "place name": "Beverly Hills",
 *             "longitude": "-118.4065",
 *             "state": "California",
 *             "state abbreviation": "CA",
 *             "latitude": "34.0901"
 *         }
 *     ]
 * }
 */
public class Chapter1Test {

    @Test
    public void checkPlaceNameInResponseBody(){
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                body("places[0].'place name'",equalTo("Beverly Hills"));
    }
}
