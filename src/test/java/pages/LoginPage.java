package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "logInModalLabel") WebElement title;
    @FindBy(linkText = "Username:") WebElement usernameFieldTitle;
    @FindBy(id = "loginusername") WebElement usernameField;
    @FindBy(linkText = "Password:") WebElement passwordFieldTitle;
    @FindBy(id = "loginpassword") WebElement passwordField;
    @FindBy(xpath = "//button[text()='Log in']") WebElement loginBtn;
    @FindBy(linkText = "Close") WebElement closeBtn;

    public LoginPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void fillUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void fillPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
