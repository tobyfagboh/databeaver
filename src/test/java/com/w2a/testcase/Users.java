package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
public class Users extends TestBase {
	LoginTest log = new LoginTest();
	@Test(priority=0)
	public void ViewExistingUsers() throws InterruptedException, IOException {
		log.Validlogin();
	}
	@Test(priority=1)
	public void CreateUsers() {
click("settingsTab_LINKTEXT");
click("AddNewBtn_XPATH");
driver.findElement(By.name(OR.getProperty("firstNameField_NAME"))).sendKeys(OR.getProperty("firstNameText"));
driver.findElement(By.name(OR.getProperty("lastNameFiedl_NAME"))).sendKeys(OR.getProperty("lastNameText"));
driver.findElement(By.id(OR.getProperty("emailField_ID"))).sendKeys(OR.getProperty("emailText"));
driver.findElement(By.name(OR.getProperty("phonefield_NAME"))).sendKeys(OR.getProperty("phoneNumber"));
driver.findElement(By.name(OR.getProperty("addressField_NAME"))).sendKeys(OR.getProperty("addressText"));
driver.findElement(By.name(OR.getProperty("bvnField_NAME"))).sendKeys(OR.getProperty("bvnText"));
WebElement date =driver.findElement(By.name(OR.getProperty("DOBField_NAME")));
date.sendKeys(OR.getProperty("DOBText"));
date.sendKeys(Keys.ENTER);
date.submit();
	}

}
