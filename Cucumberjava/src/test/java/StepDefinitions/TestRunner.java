package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinitions" }, monochrome = true,
//plugin={"pretty","html:target/HtmlReports "}
//plugin={"pretty","json:target/JSonReports.json "}
		plugin = { "pretty", "junit:target/JUnitReports.xml", "html:target/HtmlReports "}, 
		tags = "@smoketest")
public class TestRunner {

}
