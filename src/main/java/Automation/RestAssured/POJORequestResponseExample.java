package Automation.RestAssured;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class POJORequestResponseExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         * STEP 1: CREATE REQUEST POJO
         * ============================================================
         *
         * We are NOT using a parameterised constructor.
         * We create the object using the default constructor
         * and populate the values using setters.
         */

        User requestUser = new User();

        requestUser.setId(101);
        requestUser.setName("Swapnil");
        requestUser.setEmail("swapnil@gmail.com");
        requestUser.setAge(35);


        /*
         * ============================================================
         * STEP 2: JAVA OBJECT
         * ============================================================
         *
         * At this point requestUser contains:
         *
         * id    = 101
         * name  = Swapnil
         * email = swapnil@gmail.com
         * age   = 35
         *
         */


        /*
         * ============================================================
         * STEP 3: SEND POJO AS REQUEST BODY
         * ============================================================
         *
         * .body(requestUser)
         *
         * RestAssured/Jackson converts the Java object into JSON.
         *
         * Java Object
         *      ↓
         * Serialization
         *      ↓
         * JSON
         *
         * JSON sent to API:
         *
         * {
         *     "id": 101,
         *     "name": "Swapnil",
         *     "email": "swapnil@gmail.com",
         *     "age": 35
         * }
         */

        Response response =
                given()
                        .contentType("application/json")
                        .body(requestUser)
                        .when()
                        .post("https://gorest.co.in/public/v2/users");


        /*
         * ============================================================
         * STEP 4: READ RESPONSE USING JSONPATH
         * ============================================================
         *
         * Suppose API returns:
         *
         * {
         *     "id": 101,
         *     "name": "Swapnil",
         *     "email": "swapnil@gmail.com",
         *     "age": 35
         * }
         */
        System.out.println(response.prettyPrint());
        String name = response.jsonPath().getString("name");
        String email = response.jsonPath().getString("email");
        int id = response.jsonPath().getInt("id");
        int age = response.jsonPath().getInt("age");

        System.out.println("========== JSONPATH RESPONSE ==========");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
        System.out.println("Age   : " + age);


        /*
         * ============================================================
         * STEP 5: DESERIALIZE RESPONSE INTO POJO
         * ============================================================
         *
         * JSON
         *   ↓
         * Deserialization
         *   ↓
         * User Java Object
         */

        User responseUser = response.as(User.class);


        /*
         * ============================================================
         * STEP 6: READ VALUES USING GETTERS
         * ============================================================
         *
         * Now responseUser is a Java object.
         * Therefore, we can use getters.
         */

        System.out.println();
        System.out.println("========== POJO RESPONSE ==========");

        System.out.println("ID    : " + responseUser.getId());
        System.out.println("Name  : " + responseUser.getName());
        System.out.println("Email : " + responseUser.getEmail());
        System.out.println("Age   : " + responseUser.getAge());
    }


    /*
     * ================================================================
     * POJO CLASS
     * ================================================================
     *
     * No parameterised constructor is required.
     *
     * Default constructor + setters
     *       ↓
     * Build request
     *
     * Getters
     *       ↓
     * Read response
     */

    public static class User {

        private int id;
        private String name;
        private String email;
        private int age;


        // Default constructor
        public User() {
        }
        // Getters
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }
        public int getAge() {
            return age;
        }
        // Setters

        public void setId(int id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}
