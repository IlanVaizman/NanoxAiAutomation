package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static stepDefinitions.Hooks.wait;

public class CartPage {

    @FindBy(className = "success")
    List<WebElement> itemRow;
    @FindBy(className = "name")
    List<WebElement> itemName;
    @FindBy(className = "name")
    List<WebElement> itemPrice;
    @FindBy(className = "name")
    List<WebElement> itemDeleteBtn;
    @FindBy(id = "totalp")
    WebElement totalAmount;
    @FindBy(css = "[data-target='#orderModal']")
    WebElement orderModalTrigger;

    public CartPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void placeOrder() {
        orderModalTrigger.click();
    }

    public void verifyItemInCart() {
        wait.until(ExpectedConditions.visibilityOfAllElements(itemRow));
        Assert.assertEquals(1, itemRow.size());
    }

    public void verifyTotalPrice() {
        Assert.assertEquals(totalAmount.getText(), ItemPage.ItemPricePage);
    }
}
