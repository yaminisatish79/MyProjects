package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/yamin/eclipse-workspace/sample_BDD/src/test/resources/sampleFeatures/amazonOrderPageFeature.feature"},
		glue = {"stepDefinitions","amazonHooks"},
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
				},
		monochrome = true,
		dryRun=false
		
		)
public class AmazonOrderPageTestRunner {

	
}
