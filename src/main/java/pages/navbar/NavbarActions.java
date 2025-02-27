package pages.navbar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavbarActions extends NavbarPage {
    WebDriver driver;

    public NavbarActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {
        loginBtn.click();
    }
}
