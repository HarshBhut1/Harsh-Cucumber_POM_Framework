package stepDefinitions;

import org.testng.Assert;

import com.qa.app.driverFactory.DriverFactory;
import com.qa.app.pages.LandingPage;
import com.qa.app.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStep {
	
	private String actualTittle;
	private String actualHeader;
	private String loginPageTittle;
	private LoginPage loginPage;
	private LandingPage landingPage = new LandingPage(DriverFactory.getDriver());
	
	@Given("user is on landing Page")
	public void user_is_on_landing_page() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/");
	}

	@When("user gets the tittle of the page")
	public void user_gets_the_tittle_of_the_page() {
		actualTittle = landingPage.getTittle();
	}
	
	@Then("landing page tittle should be {string}")
	public void landing_page_tittle_should_be(String expectedTittle) {
		Assert.assertEquals(actualTittle, expectedTittle);
	}


	@When("user gets the header of the page")
	public void user_gets_the_header_of_the_page() {
		actualHeader = landingPage.getHeader();
	}

	@Then("page header should be {string}")
	public void page_header_should_be(String expectedHeader) {
		Assert.assertEquals(actualHeader, expectedHeader);
	}

	@Then("user verify Join button is clickable")
	public void user_verify_join_button_is_clickable() {
		Assert.assertTrue(landingPage.varifyJoinButton());
	}

	@Then("user verify login button is clickable")
	public void user_verify_login_button_is_clickable() {
		Assert.assertTrue(landingPage.verifyLoginButton());
	}

	@Then("user clicks on the login button and lands on login page")
	public void user_clicks_on_the_login_button_and_lands_on_login_page() {
		loginPage = landingPage.getLogin();
	}
	
	@Then("user gets the tittle of the Login page")
	public void user_gets_the_tittle_of_the_Login_page() {
		loginPageTittle = loginPage.getTittle();
	}
	
	@Then("login page tittle should be {string}")
	public void login_page_tittle_should_be(String expectedTittle) {
		Assert.assertEquals(loginPageTittle, expectedTittle);
	}

}
