package de.db.dibe.step_defs;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class test {


    @Given("test")
    public void test() {
        Response response = RestAssured.get().prettyPeek();
        response.then()
                .assertThat()
                .statusCode(200);
    }


}
