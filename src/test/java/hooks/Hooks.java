package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.qa.app.driverFactory.DriverFactory;
import com.qa.app.pages.HomePage;
import com.qa.app.pages.LandingPage;
import com.qa.app.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	DriverFactory df;
	public WebDriver driver;
	public Properties prop;
	public LandingPage landingPage;
	public LoginPage loginPage;
	public HomePage homePage;

	@Before
	public void bf() {
		System.out.println("Before tag");
		df = new DriverFactory();
		prop = df.init_Properties();
		driver = df.init_Driver(prop);
		
	}

	@BeforeStep
	public void bdStep() {
		System.out.println("Before Step");
	}

	@AfterStep
	public void afStep() {
		System.out.println("After Step");
	}

	@After(order = 0)
	public void af() {
		System.out.println("After Tag");
		driver.quit();
	}
	@After(order = 1)
	public void screenShot(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			scenario.attach(df.getScreenShotPath(scenario.getName(), driver), "image/png", screenShotName);
		}
	}
	
}
