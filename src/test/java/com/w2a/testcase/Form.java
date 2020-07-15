package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class Form extends TestBase{
	LoginTest login = new LoginTest();
	@Test
	public void validateFormCreation() throws InterruptedException, IOException {
		login.Validlogin();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("AddBtn_XPATH"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("fromBtn_XPATH"))).click();
		driver.findElement(By.name(OR.getProperty("formNameField_NAME"))).sendKeys(OR.getProperty("formTEXT"));
		driver.findElement(By.xpath(OR.getProperty("saveBtn_XPATH"))).click();
		
		
	}

}
