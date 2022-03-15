package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	WebDriver dpdriver;

	public DashboardPage(WebDriver driver) {
		this.dpdriver = driver;
	}

	public WebElement getHeader() {
		return dpdriver.findElement(By.xpath("//h1"));
	}

	public boolean verifyHeader() {
		return getHeader().isDisplayed();
	}
}
