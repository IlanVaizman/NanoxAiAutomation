package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

import static stepDefinitions.Hooks.wait;

public class ItemsMainPage {

    @FindBy(className = "card")
    List<WebElement> itemCard;
    @FindBy(className = "card-title")
    List<WebElement> itemTitle;
    @FindBy(css = ".card h5")
    List<WebElement> itemPrice;
    @FindBy(id = "article")
    List<WebElement> itemDescription;

    public ItemsMainPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void chooseRandomItem() {
        wait.until(ExpectedConditions.visibilityOf(itemCard.get(0)));

        Random random = new Random();
        int index = random.nextInt(itemCard.size());
        WebElement selectedItem = itemCard.get(index);

        // Print item details
        System.out.println("Item Details: " + selectedItem.getText());
        itemTitle.get(index).click();
    }
}
