package classTestSetup;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



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

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
