package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static stepDefinitions.Hooks.driver;
import static stepDefinitions.Hooks.wait;

public class LoginPage {

    @FindBy(id = "logInModalLabel")
    WebElement title;
    @FindBy(css = "label[for='log-name']")
    WebElement usernameFieldTitle;
    @FindBy(id = "loginusername")
    WebElement usernameField;
    @FindBy(css = "label[for='log-pass']")
    WebElement passwordFieldTitle;
    @FindBy(id = "loginpassword")
    WebElement passwordField;
    @FindBy(css = "button[onclick='logIn()']")
    WebElement loginBtn;
    @FindBy(xpath = "(//button[contains(text(), 'Close')])[3]")
    WebElement closeBtn;

    public LoginPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void verifyPage() {
        wait.until(ExpectedConditions.visibilityOf(title));

        Assert.assertEquals("Log in", title.getText());
        Assert.assertEquals("Username:", usernameFieldTitle.getText());
        usernameField.isEnabled();
        Assert.assertEquals("Password:", passwordFieldTitle.getText());
        passwordField.isEnabled();
        Assert.assertEquals("Close", closeBtn.getText());
        Assert.assertEquals("Log in", loginBtn.getText());

        Assert.assertFalse(loginBtn.isEnabled());
        closeBtn.isEnabled();
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

    public void verifyAlertError(String error) {
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(error, driver.switchTo().alert().getText());
    }
}
