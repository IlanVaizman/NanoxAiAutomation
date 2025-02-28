package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static stepDefinitions.Hooks.driver;
import static stepDefinitions.Hooks.wait;

public class ItemPage {

    public static String ItemPricePage;

    @FindBy(className = "name")
    WebElement itemName;
    @FindBy(className = "price-container")
    WebElement itemPrice;
    @FindBy(className = "description")
    WebElement itemDescription;
    @FindBy(className = "btn-success")
    WebElement addToCart;

    public ItemPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void setAddToCart() {
        wait.until(ExpectedConditions.visibilityOf(addToCart));
        ItemPricePage = itemPrice.getText().replaceAll("\\D", "");
        addToCart.click();
    }

    public void verifyAlertMsg(String msg) {
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(msg, driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
