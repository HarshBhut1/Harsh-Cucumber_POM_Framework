package stepDefinitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class xyz {

	@Given("this is given3")
	public void this_is_given3() {
		System.out.println("this is given 3");
	}

	@When("this is when3")
	public void this_is_when3() {
		System.out.println("this is when 3");
	}

	@When("this is and3")
	public void this_is_and3() {
		System.out.println("this is AND 3");
	}

	@Then("this is then3")
	public void this_is_then3() {
		System.out.println("this is then 3");
	}

	@Then("this is and after then3")
	public void this_is_and_after_then3() {
		System.out.println("this is AND after then 3");
	}

	@Then("this is but3")
	public void this_is_but3() {
		System.out.println("this is but 3");
	}

	@Given("this is given4")
	public void this_is_given4() {
		System.out.println("this is given 4");
	}

	@When("this is when4")
	public void this_is_when4() {
		System.out.println("this is when 4");
	}

	@When("this is and4")
	public void this_is_and4() {
		System.out.println("this is AND 4");
	}

	@Then("this is then4")
	public void this_is_then4() {
		System.out.println("this is then 4");
	}

	@Then("this is and after then4")
	public void this_is_and_after_then4() {
		System.out.println("this is AND after then 4");
	}

	@Then("this is but4")
	public void this_is_but4() {
		System.out.println("this is but 4");
	}

}
