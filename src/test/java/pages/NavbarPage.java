package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static stepDefinitions.Hooks.wait;

public class NavbarPage  {

    @FindBy(linkText = "Home") WebElement homeBtn;
    @FindBy(linkText = "Contact") WebElement contactBtn;
    @FindBy(linkText = "About us") WebElement aboutUsBtn;
    @FindBy(linkText = "Cart") WebElement cartBtn;
    @FindBy(linkText = "Log in") WebElement loginBtn;
    @FindBy(linkText = "Sign up") WebElement signupBtn;
    @FindBy(id = "nameofuser") WebElement userName;

    public NavbarPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void verifyUserName(String name) {
        wait.until(ExpectedConditions.visibilityOf(userName));
        Assert.assertEquals(userName.getText(),name);
    }
}


