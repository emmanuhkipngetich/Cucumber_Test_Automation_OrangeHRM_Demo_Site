import Setup.Setup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},
		monochrome = true,
		publish = true,
		dryRun = false)

public class TestRunner extends Setup
{
	
}
