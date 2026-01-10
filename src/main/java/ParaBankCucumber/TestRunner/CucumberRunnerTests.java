package ParaBankCucumber.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/Features"},
        glue = {"java/stepDefinitions"},
        plugin = {"pretty",
                "html:target/cucumber-reports/Login.html",  // HTML report
                "json:target/cucumber-reports/Login.json" },// JSON report
        monochrome = true)


public class CucumberRunnerTests extends AbstractTestNGCucumberTests {



}



