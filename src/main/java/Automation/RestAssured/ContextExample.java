package Automation.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ContextExample {

    // Context variables
    private static int userId;
    private static String userName;

    public static void main(String[] args) {

        // ==========================================
        // REQUEST 1
        // ==========================================

        Response response =
                given()
                        .when()
                        .get("https://gorest.co.in/public/v2/users/1");

        response.prettyPrint();


        // ==========================================
        // GET VALUES FROM RESPONSE
        // ==========================================

        int id = response.jsonPath().getInt("id");
        String name = response.jsonPath().getString("name");


        // ==========================================
        // SET VALUES IN CONTEXT
        // ==========================================

        setUserId(id);
        setUserName(name);


        // ==========================================
        // GET VALUES FROM CONTEXT
        // ==========================================

        System.out.println("User ID   : " + getUserId());
        System.out.println("User Name : " + getUserName());


        // ==========================================
        // REQUEST 2
        // USE ID FROM CONTEXT
        // ==========================================

        Response response2 =
                given()
                        .pathParam("userId", getUserId())
                        .when()
                        .get("https://gorest.co.in/public/v2/users/{userId}");

        response2.prettyPrint();
    }


    // ==========================================
    // SET METHODS
    // ==========================================

    public static void setUserId(int id) {
        userId = id;
    }

    public static void setUserName(String name) {
        userName = name;
    }


    // ==========================================
    // GET METHODS
    // ==========================================

    public static int getUserId() {
        return userId;
    }

    public static String getUserName() {
        return userName;
    }
}