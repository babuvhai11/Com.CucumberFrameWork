package UpsTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C://Users//nahid//eclipse-workspace//Com.CucumberFrameWork//features//Login00.feature",
		glue = "steapDefinition",
		dryRun= false,
		monochrome=true,
		plugin =  {"pretty", "html:target/test-output"}
		
		
		)

public class testRunner {

}
