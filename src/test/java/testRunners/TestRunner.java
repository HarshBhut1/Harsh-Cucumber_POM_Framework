package testRunners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( // the top 2 features and glue are complusary for cucumber options. We can give path for the folder or specific feature file if we have multiple feature file.
		features = {"src/test/resources/appFeatures/"}, //the path of the feature file
		glue = {"stepDefinitions", "hooks"}, //we can give path or the name of the step definitaion
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				}, // plugin is only for when generating the report
		monochrome = true, // this display the console output in a proper readable formate
		dryRun = false // to check the mapping is proper between feature file and step definition file
		)


public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
		}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test 1 ");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test 1 ");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite 1 ");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite 1 ");
	}

}
