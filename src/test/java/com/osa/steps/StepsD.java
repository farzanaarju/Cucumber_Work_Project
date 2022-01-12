package com.osa.steps;



import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Base.Browser1;
import com.Base.FileReading;
import com.osaPages.AboutButton;
import com.osaPages.ForumButton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsD{

Properties pr = FileReading.readFromProperties("C:\\Users\\hkhan\\OneDrive\\Desktop\\Cucumber_Work\\Cucumber_Work_Project\\src\\main\\resources\\File.properties");
WebDriver dr;

@Given("I open chrome browser")
public void i_open_chrome_browser() {
	
	
    dr=Browser1.openBrowser((String) pr.get("browserType"));
}

@When("I navigate to osa  Home page")
public void i_nevigate_to_osa_Home_page() {
	
  dr.get((String) pr.get("url"));
}
String actualT;
String expectedT;
@Then("I verify the title")
public void i_verify_the_title() {
	actualT= dr.getTitle();
	expectedT="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
    Assert.assertEquals(expectedT,actualT);
}

// About Button

AboutButton bt;
@Then("I have to click the About page")
public void i_have_to_click_the_About_page() {
	 //dr.findElement(By.xpath("//*[@id=\"ftco-nav\"]/ul/li[2]/a")).click();  
	
        bt = new AboutButton(dr);
	bt.clickAboutButton();
}
     
@Then("After clicking i need to verify the title")
public void after_clicking_i_need_to_verify_the_title() {
	 String actualAboutPageT= dr.getTitle();
	 String expectedAboutPageT="OSA Consulting Tech - Take all steps for your career.";
	 Assert.assertEquals(actualAboutPageT,expectedAboutPageT);  
	
}

@Then("I will click This three buttons Our_Mission Our_Vision & Our_Value")
public void i_will_click_This_three_buttons_Our_Mission_Our_Vision_Our_Value() {
	
   // dr.findElement(By.xpath("//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[1]/a")).click();
	bt.clickOurMission();
	bt.clickOurVision();
	bt.clickOurValue();
	
	// dr.findElement(By.xpath("//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[2]/a")).click();
	// dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	// dr.findElement(By.xpath("//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[3]/a")).click();
}

// Forum Button

ForumButton fb ;
@Given("I am already in Osa forum page")
public void i_am_already_in_Osa_forum_page() {
   dr=Browser1.openBrowser((String) pr.get("browserType"));
   dr.get((String) pr.get("url"));
   
   //dr.findElement(By.xpath("//a[text()='Forum']")).click();
   
   fb = new ForumButton(dr);
   fb.clickForumButton();
}
@When("Now I have to type valid Username_{string}")
public void now_I_have_to_type_valid_Username_(String username) {
  // dr.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	
	fb.typeUsername(username);
}

@And("Next I have to type valid Password_{string}")
public void next_I_have_to_type_valid_Password_(String password) {
   //dr.findElement(By.xpath("//input[@id='password']")).sendKeys(password); 
	
	fb.typePassword(password);
}


@Then("I have to press the login button")
public void i_have_to_press_the_login_button() {
	 //dr.findElement(By.xpath("//button[@id='login_button']")).click();
	
	fb.clickLoginButton();
}

@And("Next verify the login page")
public void next_verify_the_login_page() {
    String actualForumT= dr.getTitle();
    String expectedForumT="OSA Consulting Tech - All the projects.";
    Assert.assertEquals(actualForumT,expectedForumT);
}

@And("I have to click the interview questions button")
public void i_have_to_click_the_interview_questions_button() {
	
	  
      dr.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a")).click();
}

@And("I have to click the student page button")
public void i_have_to_click_the_student_page_button() {
     dr.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[12]/a")).click();
}
@And("Verify the student login page")
public void verify_the_student_login_page() {
	String actualstudentpageT= dr.getTitle();
    String expectedstudentpageT="Student Page";
    Assert.assertEquals(actualstudentpageT,expectedstudentpageT);
}

@And("After verify click log out")
public void after_verify_click_log_out(){
   dr.findElement(By.xpath("//*[@id=\"btn_logout\"]")).click();
}

@And("I have to close the browser")
public void i_have_to_close_the_browser() {
	dr.close();
}

}
