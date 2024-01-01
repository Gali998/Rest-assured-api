package examples;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Chapter2Test {

    @Test
    public void checkStatusCode() {
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void checkContentType() {
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                contentType(ContentType.JSON);
    }
}
