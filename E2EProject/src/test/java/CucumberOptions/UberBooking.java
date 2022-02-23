package CucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/feature/UberBooking.feature" }, glue = {
		"StepDefinition" }, plugin = "pretty", tags = "not @Smoke")
public class UberBooking extends AbstractTestNGCucumberTests {

}
