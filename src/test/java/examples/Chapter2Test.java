package examples;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Chapter2Test {

    @Test
    public void checkStatusCode(){
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                statusCode(200);
    }
}
