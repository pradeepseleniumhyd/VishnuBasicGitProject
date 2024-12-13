package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\User\\Documents\\Vishnu Class\\VishnuProject\\src\\test\\java\\features",
		glue= {"stepdef"},
		dryRun = true,
		plugin= {"pretty","html:Vishnu.html","json:vishnu.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true,
		monochrome = true
		)
public class loginRunner2 extends AbstractTestNGCucumberTests {
	//test

}
