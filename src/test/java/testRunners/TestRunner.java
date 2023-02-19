package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/", glue={"stepsDefinitions"},
monochrome=true,
plugin={"pretty", "html:target/cucumber-html-report.html", "json:target/cucmber-report.json"}
//		tags = "",
		)

public class TestRunner {

}
