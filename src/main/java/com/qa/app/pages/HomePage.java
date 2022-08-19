package com.qa.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
	
	private WebDriver driver;
	
	By name = By.xpath("//span[@class='navbar-current-user']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getName() {
		return driver.findElement(name).getText();
	}
	
	

}
