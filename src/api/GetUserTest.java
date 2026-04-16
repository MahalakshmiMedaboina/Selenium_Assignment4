package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserTest {

    public static void main(String[] args) {

        // Send GET request
        Response response = RestAssured.get("https://reqres.in/api/users/2");

        // Print response
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asString());
    }
}