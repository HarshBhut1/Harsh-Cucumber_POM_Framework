package com.qa.app.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.app.utils.Constants;

public class LandingPage{
	
	private WebDriver driver;
	//page Locators:
	
	private By header = By.linkText("Home");
	
	private By login = By.className("register-btn");
	
	private By joinButton = By.className("btn-theme");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTittle() {
		return driver.getTitle();
	}
	
	public String getHeader() {
		return driver.findElement(header).getText();
	}

	public boolean verifyLoginButton() {
		
		
		if((new WebDriverWait(this.driver,Duration.ofSeconds(Constants.DEFAULT_ELEMENT_WAIT_TIME_OUT))).until(ExpectedConditions.elementToBeClickable(login)) != null) {
			return true;
		}else {
			return false;
		}


	}

	public boolean varifyJoinButton() {
		
		if((new WebDriverWait(this.driver,Duration.ofSeconds(Constants.DEFAULT_ELEMENT_WAIT_TIME_OUT))).until(ExpectedConditions.elementToBeClickable(joinButton)) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public LoginPage getLogin() {
		driver.findElement(login).click();
		return new LoginPage(driver);
	}
	
	

}
