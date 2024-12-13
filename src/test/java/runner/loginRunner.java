package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\User\\Documents\\Vishnu Class\\VishnuProject\\src\\test\\java\\features",
		glue= {"stepdef"},
		dryRun = true,
		plugin= {"pretty"},
		tags = "smoke"
		
		)

public class loginRunner {

}
