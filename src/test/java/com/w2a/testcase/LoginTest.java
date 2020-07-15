package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;


public class LoginTest extends TestBase{
	
	@Test(priority=1)
	public void InvalidLogin() throws InterruptedException {
		driver.findElement(By.name(OR.getProperty("loginEmailField_NAME"))).sendKeys(OR.getProperty("loginEmail_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("loginPwdField_XPATH"))).sendKeys(OR.getProperty("invalidPassword_TEXT"));
		click("loginBtn_XPATH");
		WebElement errorMsg = driver.findElement(By.xpath(OR.getProperty("errorMSg_XPATH")));
		//errorMsg.click();
		if (errorMsg.isDisplayed()) {
			System.out.println("Alert is displayed");
		}else {
			System.out.println("No alert");
		}
		String errorAlert = errorMsg.getText();
		System.out.println(errorAlert);
		Thread.sleep(3000);
	}
	

	@Test(priority=2)
	public void Validlogin() throws InterruptedException, IOException {
		driver.findElement(By.name(OR.getProperty("loginEmailField_NAME"))).clear();
	driver.findElement(By.name(OR.getProperty("loginEmailField_NAME"))).sendKeys(OR.getProperty("loginEmail_TEXT"));
	driver.findElement(By.xpath(OR.getProperty("loginPwdField_XPATH"))).clear();
	driver.findElement(By.xpath(OR.getProperty("loginPwdField_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));
	click("loginBtn_XPATH");
	Thread.sleep(3000);
}
	
	

}
