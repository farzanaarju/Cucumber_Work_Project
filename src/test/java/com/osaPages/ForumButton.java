package com.osaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumButton {
	
 WebDriver dr;
	
	public ForumButton(WebDriver dr) {
		
		this.dr = dr;
		
		PageFactory.initElements(dr, this);
		
	}
	
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[7]/a") WebElement ForumBox;
@FindBy(name="username") WebElement userBox;
@FindBy(name="password") WebElement passwordBox;
@FindBy(id="login_button") WebElement loginBox;

public void clickForumButton() {
	
	ForumBox.click();
}

public void typeUsername(String username) {
	
	userBox.sendKeys(username);
}

public void typePassword(String password) {
	
	passwordBox.sendKeys(password);
}

public void clickLoginButton() {
	
	loginBox.click();
}







}
