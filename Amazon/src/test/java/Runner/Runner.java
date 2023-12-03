package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Features"}, 
		glue = {"StepDefinition"},
                 plugin ={"pretty","html:target/ProjectReports/CucumberReport.html"
             			,"pretty","json:target/ProjectReports/CucumberReports.json",
             			"pretty", "junit:target/ProjectReports/CucumberReports.xml"},
        dryRun=true,
        tags = "@test1")

public class Runner extends AbstractTestNGCucumberTests {
}