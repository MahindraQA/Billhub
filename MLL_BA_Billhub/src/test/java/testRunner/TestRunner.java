package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	 .//Features/CreateMemo.feature
		features= ".//Features/CreateMemo.feature",
		glue= "stepDefinitions",
		dryRun=false,
		monochrome=true,
		strict= false,
		plugin= {"pretty","html:test-output"
				
		}
		
		)

public class TestRunner {

}
