package com.dice.stepdefs;

import com.dice.serenitysteps.UINamesSerenitySteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UINamesStepDef {
    @Steps
    UINamesSerenitySteps uiNamesSerenitySteps;

    @When("^the user sends a request for (\\d+) name$")
    public void the_user_sends_a_request_for_name(int arg1) throws Exception {
        uiNamesSerenitySteps.getFiveNames();

    }


    @Then("^the server should send back (\\d+) name$")
    public void the_server_should_send_back_name(int arg1) throws Exception {
        uiNamesSerenitySteps.verifyFiveNames();
    }

    @When("^the user sends a request for (\\d+) female name$")
    public void the_user_sends_a_request_for_female_name(int arg1) throws Exception {

    }

    @Then("^the server should send back (\\d+) female name$")
    public void the_server_should_send_back_female_name(int arg1) throws Exception {

    }
}
