package com.dice.serenitysteps;

import com.dice.utilities.HomePageConstants;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.*;

import static io.restassured.RestAssured.given;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.util.Map;

import static io.restassured.path.json.JsonPath.given;

public class UINamesSerenitySteps extends ScenarioSteps {
    final static Logger logger = Logger.getLogger(UINamesSerenitySteps.class);
    private List<Map> list;

    @Step
    public void getFiveNames() {
        RestAssured.basePath="https://uinames.com";
        Response responseName =
                given().accept(ContentType.JSON)
                        .and().params("amount", 5, "region", "United States", "ext", "phone")
                        .when().get(RestAssured.basePath+"/api/");

        JsonPath jsonPath = responseName.jsonPath();
        list = jsonPath.getList("",Map.class);
        Assert.assertEquals(200, responseName.statusCode());

    }

    @Step
    public void verifyFiveNames() {


        Assert.assertEquals(5,list.size());
        Assert.assertTrue(list.get(0).get("age") instanceof Number);
        Assert.assertTrue(list.get(0).get("name") instanceof String);

    }
}
