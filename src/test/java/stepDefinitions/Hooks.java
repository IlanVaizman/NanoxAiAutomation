package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {

    static String link = "https://www.demoblaze.com/index.html";
    public static WebDriver driver;
    public static Duration waitTime = Duration.ofSeconds(5);
    public static WebDriverWait wait;

    @Before
    public static void initialize() {
        System.out.printf("Opening browser with link: %s\n", link);
        driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(waitTime);
        wait = new WebDriverWait(driver, waitTime);
    }

    @After
    public static void closeBrowser() {
        System.out.println("Closing browser");
        if (driver != null) {
            driver.quit();
        }
    }
}
