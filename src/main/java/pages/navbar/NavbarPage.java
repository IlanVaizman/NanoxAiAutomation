package pages.navbar;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarPage {

    @FindBy(linkText = "Home")
    WebElement homeBtn;

    @FindBy(linkText = "Contact")
    WebElement contactBtn;

    @FindBy(linkText = "About us")
    WebElement aboutUsBtn;

    @FindBy(linkText = "Cart")
    WebElement cartBtn;

    @FindBy(linkText = "Log in")
    WebElement loginBtn;

    @FindBy(linkText = "Sign up")
    WebElement signupBtn;
}


