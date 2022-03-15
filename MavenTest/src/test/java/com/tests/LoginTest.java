package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest {
	WebDriver driver = null;

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		LoginPage lp = new LoginPage(driver);

		lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

	@Test
	public void verifyHeader() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication("kiran@gmail.com", "123456");
		DashboardPage dp = new DashboardPage(driver);
		boolean value = dp.verifyHeader();
		Assert.assertTrue(value);
	}
}
