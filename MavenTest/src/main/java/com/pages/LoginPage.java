package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
//WebElements and its methods
	WebDriver lpdriver;

	public LoginPage(WebDriver driver) {
		this.lpdriver = driver;
	}

	public WebElement getUname() {
		return lpdriver.findElement(By.id("email"));
	}

	public WebElement getPassword() {
		return lpdriver.findElement(By.id("password"));
	}

	public WebElement getLoginbtn() {
		return lpdriver.findElement(By.xpath("//button"));
	}

	public void loginToApplication(String uname, String pass) {
		getUname().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLoginbtn().click();
	}
}
