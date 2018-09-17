package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"Feature/Login.feature", "Feature/CreateCompany.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty", "html:test-output"},
		tags= {"@SmokeTest"},
//		tags= {"@SmokeTest, @RegressionTest"},   ******Execute SmokeTest OR RegressionTest******
//		tags= {"@SmokeTest","@RegressionTest"},	 ******Execute SmokeTest AND RegressionTest******
//		tags= {"@SmokeTest","~@RegressionTest"}, ******Execute SmokeTest AND Ignore RegressionTest******
		monochrome = true,
		strict = true,
		dryRun = false
		)
public class Runner {

}
