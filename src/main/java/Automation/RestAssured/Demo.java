package Automation.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


/*
*
            8. How do you validate data retrieved by an API is correct?

            Validate correctness at several layers: HTTP status and headers; response schema and data types; business rules;
            field-level values against an independent source of truth; relationships and referential integrity; persistence; and
            negative/edge cases. Do not merely assert that a field exists. For a read API, create or identify known data, call the
            API, and compare returned values with the expected record or database/service result using authorised test access.
            Practical example
*
* */

public class Demo {

    public static void main(String[] args) {


        given()
                //.header("Authorization", "Bearer " + token)
                .when()
                //.get("/api/members/" + memberId)
                .then()
                .statusCode(200)
                //.body("memberId", equalTo(memberId))
                .body("status", equalTo("ACTIVE"))
                .body("age", greaterThanOrEqualTo(0))
                .body("effectiveDate", notNullValue())
                .body("Id", notNullValue());
    }
}
