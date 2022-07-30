package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",
		glue = "stepDefination", stepNotifications = true,
		tags = "@MobileTest",
		plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json","junit:target/cukes.xml"},
		dryRun = true,
		monochrome = true //for giving console output in proper format
		)

public class TestRunner {

}
