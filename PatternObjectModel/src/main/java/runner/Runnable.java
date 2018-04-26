package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/main/java/feature/login.feature",glue = {"pages","hooks"},tags= {"@Smoke","@Regression"})
	public class Runnable {

	}


