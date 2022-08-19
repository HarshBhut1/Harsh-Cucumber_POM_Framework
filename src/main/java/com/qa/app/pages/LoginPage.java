package com.qa.app.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.app.utils.Constants;

public class LoginPage {
	
	
	private WebDriver driver;
	
	private By header = By.className("heading3");
	private By emailID = By.id("email");
	private By password = By.id("password");
	private By forgotPassword = By.linkText("Forgot Password");
	private By rememberMe = By.className("v-middle");
	private By loginBtn = By.className("btn-primary");
	private By signUp = By.linkText("Sign Up");
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Setters
	
	public String getTittle() {
		return driver.getTitle();
	}
	
	public String getHeader() {
		return driver.findElement(header).getText();
	}

	public WebElement getEmailID() {
		return driver.findElement(emailID);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public boolean getForgotPassword() {
		if((new WebDriverWait(this.driver,Duration.ofSeconds(Constants.DEFAULT_ELEMENT_WAIT_TIME_OUT))).until(ExpectedConditions.elementToBeClickable(forgotPassword)) != null) {
			return true;
		}else {
			return false;
		}
	}

	public boolean getRememberMe() {
		if((new WebDriverWait(this.driver,Duration.ofSeconds(Constants.DEFAULT_ELEMENT_WAIT_TIME_OUT))).until(ExpectedConditions.elementToBeClickable(rememberMe)) != null) {
			return true;
		}else {
			return false;
		}
	}

	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}

	public boolean getSignUp() {
		if((new WebDriverWait(this.driver,Duration.ofSeconds(Constants.DEFAULT_ELEMENT_WAIT_TIME_OUT))).until(ExpectedConditions.elementToBeClickable(signUp)) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public HomePage doLogin(String username, String password) {
		getEmailID().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginBtn().click();
		
		return new HomePage(driver);
		
	}
	

}
