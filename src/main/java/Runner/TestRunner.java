package Runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Rajkannan\\GitRepo\\CucumberBDD\\CucumberBDD\\src\\main\\java\\Features"
		,glue= {"StepDefinitions"}
		//format= {"pretty","html:test-output"}
		)
public class TestRunner {

}
