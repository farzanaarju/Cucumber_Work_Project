package com.osaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutButton {
	
	WebDriver dr;
	
	public AboutButton(WebDriver dr) {
		
		this.dr = dr;
		
		PageFactory.initElements(dr, this);
		
	}
	
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[2]/a") WebElement aboutBox;
@FindBy(xpath="//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[1]/a") WebElement ourMissionButton;
@FindBy(xpath="//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[2]/a") WebElement ourVisionButton;
@FindBy(xpath="//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[3]/a") WebElement ourValueButton;

public void clickAboutButton() {
	
	aboutBox.click();
}

public void clickOurMission() {
	
	ourMissionButton.click();
}


public void clickOurVision() {
	
	ourVisionButton.click();
}

public void clickOurValue() {
	
	ourValueButton.click();
}

}
