package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/yamin/eclipse-workspace/sample_BDD/src/test/resources/sampleFeatures/amazonLoginFeature.feature"},
		glue = {"stepDefinitions","amazonHooks"},
		//tags = "@Smoke",
		plugin = {"pretty"}
		)
public class AmazonLoginTestRunner {

}
