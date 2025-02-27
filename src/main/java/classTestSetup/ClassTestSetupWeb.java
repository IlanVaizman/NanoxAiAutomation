package classTestSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

//@CucumberOptions(
//        features = "src/test/java/e2e/Feature",
//        glue = {"src/main/java/pages"}
//)

public class ClassTestSetupWeb {

    static String link = "https://www.demoblaze.com/index.html";
    public static WebDriver driver;

    @Before
    public static void initialize() {
        driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public  void closeBrowser() {
        driver.quit();
    }
}
