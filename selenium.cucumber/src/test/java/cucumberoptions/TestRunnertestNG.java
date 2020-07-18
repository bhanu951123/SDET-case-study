package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			
			features={"src/test/java/features/"},
			glue={"stepDefinations"},
			
			plugin={"pretty", // To display in console
					"html:target/cucumber-html-report-testng",  // to display in HTML Format
					"json:target/cucumber-json-report-testng"   // To Display in JSON Format
			}
			)

public class TestRunnertestNG extends AbstractTestNGCucumberTests {

}
