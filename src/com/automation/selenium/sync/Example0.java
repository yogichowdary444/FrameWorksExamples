package com.automation.selenium.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use WebDriverWait and ExpectedConditions*/
class Example0 {
	
	private WebDriver driver = null;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void waitUntilAlertIsDisplayed() {
		try {
			driver.get(ApplicationConstants.SYNC_PATH +"WaitUntilAlertDisplayed.html");
			WebElement button = driver.findElement(By.xpath("//*[text()='Click']"));
			button.click();
			Alert alert =  driver.switchTo().alert();
			System.out.println("Alert Text:" + alert.getText());
			alert.accept();	
		}catch(Exception exception) {
			System.out.println("Exception Message:"+exception.getMessage());
		}
		
	}
	
	@AfterTest
	public void destory(){
		driver.quit();
	}

}
