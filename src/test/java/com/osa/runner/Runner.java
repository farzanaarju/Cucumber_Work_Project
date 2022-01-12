package com.osa.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src/test/java/com/osa/features"},
		glue={"com.osa.steps"},
		monochrome=true,
		plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
		//strict = true,
		//dryRun=true,
		//tags= {"@Forum"}
		
		)



public class Runner extends AbstractTestNGCucumberTests {

}
