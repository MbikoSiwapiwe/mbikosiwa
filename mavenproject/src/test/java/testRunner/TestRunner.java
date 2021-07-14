package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"featurefiles"},
		glue = {"com.maven.mavenproject.steps"},
		plugin = {"pretty", "junit:jUnitReport"}
		)
		
public class TestRunner {

}
