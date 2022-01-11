package com.osa.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Base.Browser1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsD {

WebDriver dr;
@Given("I open chrome browser")
public void i_open_chrome_browser() {
    dr=Browser1.openBrowser("chrome");
}

@When("I nevigate to osa  Home page")
public void i_nevigate_to_osa_Home_page() {
  dr.get("https://www.osaconsultingtech.com");
}
String actualT;
String expectedT;
@Then("I verify the title")
public void i_verify_the_title() {
	actualT= dr.getTitle();
	expectedT="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
    Assert.assertEquals(expectedT,actualT);
}

@And("I close browser")
public void i_close_browser() {
 dr.close();
}



}
