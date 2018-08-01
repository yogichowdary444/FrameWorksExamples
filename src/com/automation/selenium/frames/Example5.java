package com.automation.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToDefaultContent() method*/
class Example5 {

	@Test
	public void test() {
		
		WebDriver driver = null;
		
		try {
			
			driver = DriverHelper.getDriver("CHROME");

			driver.get("http://www.ramcocements.in/");

			driver.switchTo().frame(0);

			WebElement searchTextBox = driver.findElement(By.name("sp_q"));

			searchTextBox.sendKeys("Concrete");

			WebElement linkLogin = driver.findElement(By.id("ctl01_HyperLink3"));

			linkLogin.click();

			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
