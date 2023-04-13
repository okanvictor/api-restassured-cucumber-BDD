package de.db.dibe.step_defs;

import de.db.dibe.utilities.ConfigurationReader;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.reset;

public class Hooks {
    private static final String BASE_URI = ConfigurationReader.get("baseURI");
    private static final String BASE_PATH = ConfigurationReader.get("basePath");

    @Before
    public void setUp() {
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;
    }
    @AfterAll
    public static void destroy(){
        reset();
    }
}
