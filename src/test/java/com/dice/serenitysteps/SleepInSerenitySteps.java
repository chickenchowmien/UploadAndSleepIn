package com.dice.serenitysteps;

import com.dice.pages.DiceHomePage;
import com.dice.stepdefs.SleepInStepDef;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

public class SleepInSerenitySteps extends ScenarioSteps {
    final static Logger logger = Logger.getLogger(SleepInSerenitySteps.class);
    final static String email = "JamesMichaelLacson@gmail.com";
    final static String password = "Hjkl-10108586";
    DiceHomePage diceHomePage;

    @Step
    public void goToHomePage(){
        diceHomePage.open();
        getDriver().manage().window().maximize();
    }
    @Step
    public void logIn(){
        diceHomePage.buttonLogin.click();
        diceHomePage.fieldEmail.sendKeys(email);
        diceHomePage.fieldPassword.sendKeys(password+ Keys.ENTER);
    }
    @Step
    public void goToProfilePage(){

        try{
            diceHomePage.buttonDropDownMain.click();
            diceHomePage.profileLink.click();
            Thread.sleep(3000);
//            Alert alert = getDriver().switchTo().alert();
//            alert.dismiss();
            //diceHomePage.closePopUp.click();
        }catch(Exception e){
            logger.info("pop up NOT FOUND....");
        }
    }
    @Step
    public void upload(){
        logger.warn("UPDATE RESUME LINK IS LOADING......");
        diceHomePage.updateResume.waitUntilVisible();
        diceHomePage.fileUpload();

    }



}
