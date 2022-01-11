package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser1 {
	public static void main(String[] args) {
		openBrowser("chrome");
	}
	
	public static WebDriver openBrowser(String driver) { 
		WebDriver dr=null;
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {
			if(driver.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",  "C:\\Users\\arjuf\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			    dr=new ChromeDriver();
			}else if(driver.toLowerCase().equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\win\\geckodriver.exe");
				dr=new FirefoxDriver();
			}
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //webDirver wait
		}else {
			System.out.println("===========The test is running on "+System.getProperty("os.name")+"==========");
			if(driver.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver");
			    dr=new ChromeDriver();
			}else if(driver.toLowerCase().equals("firefox")) {
				System.setProperty("", "");
				dr=new FirefoxDriver();
			}
		}
		return dr;
	  }
}
