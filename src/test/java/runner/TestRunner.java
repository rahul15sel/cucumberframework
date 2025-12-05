package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import io.qameta.allure.testng.AllureTestNg;

@Listeners({AllureTestNg.class})  // <-- Add this listener for Allure TestNG
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-json/cucumber.json",  // Optional JSON output
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Allure plugin
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Nothing else needed
}
