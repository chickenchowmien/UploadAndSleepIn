package com.dice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

@DefaultUrl("https://www.dice.com/")
public class DiceHomePage extends PageObject {
    @FindBy(id = "Login_1")
    public WebElementFacade buttonLogin;

    @FindBy(id = "Email_1")
    public WebElementFacade fieldEmail;

    @FindBy(id = "Password_1")
    public WebElementFacade fieldPassword;

    @FindBy(id = "smart-toggle-link")
    public WebElementFacade buttonDropDownMain;

    @FindBy(xpath = "//a[@href='/dashboard']")
    public WebElementFacade profileLink;

    @FindBy(xpath = "//button[@class='close icon-delete-1']")
    public WebElementFacade closePopUp;

    @FindBy(id = "updateResumeLink")
    public WebElementFacade updateResume;

    public void fileUpload(){
        StringSelection path = new StringSelection("C:/Users/Dell_J/Dropbox/Resume/JamesLacsonResume2018.pdf");
        updateResume.click();
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
        //paste
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {

            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



    }
}
