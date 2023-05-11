package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/yamin/eclipse-workspace/sample_BDD/src/test/resources/sampleFeatures/amazonScenarioOutlineFeature.feature"},
		glue = {"stepDefinitions"},
		//tags = "@Smoke",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
				},
		publish= true
		)





public class AmazonScenarioOutlineRunner {

	
	
}
