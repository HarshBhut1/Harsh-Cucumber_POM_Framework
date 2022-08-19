package stepDefinitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class abc {
	

	
	@Given("this is given1")
	public void this_is_given1() {
		System.out.println("this is given 1");
	}

	@When("this is when1")
	public void this_is_when1() {
		System.out.println("this is when 1");
	}

	@When("this is and1")
	public void this_is_and1() {
		System.out.println("this is AND 1");
	}

	@Then("this is then1")
	public void this_is_then1() {
		System.out.println("this is then 1");
	}

	@Then("this is and after then1")
	public void this_is_and_after_then1() {
		System.out.println("this is AND after then 1");
	}

	@Then("this is but1")
	public void this_is_but1() {
		System.out.println("this is but 1");
	}

	@Given("this is given2")
	public void this_is_given2() {
		System.out.println("this is given 2");
	}

	@When("this is when2")
	public void this_is_when2() {
		System.out.println("this is when 2");
	}

	@When("this is and2")
	public void this_is_and2() {
		System.out.println("this is AND 2");
	}

	@Then("this is then2")
	public void this_is_then2() {
		System.out.println("this is then 2");
	}

	@Then("this is and after then2")
	public void this_is_and_after_then2() {
		System.out.println("this is AND after then 2");
	}

	@Then("this is but2")
	public void this_is_but2() {
		System.out.println("this is but 2");
	}

}
