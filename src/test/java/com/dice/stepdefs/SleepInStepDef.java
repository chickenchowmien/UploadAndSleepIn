package com.dice.stepdefs;

import com.dice.serenitysteps.SleepInSerenitySteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;

public class SleepInStepDef {
    final static Logger logger = Logger.getLogger(SleepInStepDef.class);

    @Steps
    SleepInSerenitySteps sleepInSerenitySteps;

    @Given("^the user is on Dice\\.com$")
    public void the_user_is_on_Dice_com() throws Exception {
        sleepInSerenitySteps.goToHomePage();
    }


    @And("^they log in$")
    public void they_log_in() throws Exception {
        sleepInSerenitySteps.logIn();
    }

    @And("^go to the profile page$")
    public void go_to_the_profile_page() throws Exception {
        sleepInSerenitySteps.goToProfilePage();

    }

    @Then("^the resume should be updated while I'm sound asleep$")
    public void the_resume_should_be_updated_while_I_m_sound_asleep() throws Exception {
        sleepInSerenitySteps.upload();
    }
}
