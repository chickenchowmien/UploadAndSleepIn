package com.dice;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
  
  features="src/test/resources/features", dryRun = false, tags = "@dice")
public class RunCukes {
}

