package runner;

import classTestSetup.ClassTestSetupWeb;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"}
)
public class TestRunner extends ClassTestSetupWeb {

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}



