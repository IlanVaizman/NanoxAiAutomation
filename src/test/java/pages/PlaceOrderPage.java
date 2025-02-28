package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static stepDefinitions.Hooks.wait;

public class PlaceOrderPage {

    @FindBy(id = "name")
    WebElement name;
    @FindBy(id = "country")
    WebElement country;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "card")
    WebElement card;
    @FindBy(id = "month")
    WebElement month;
    @FindBy(id = "year")
    WebElement year;
    @FindBy(css = "button[onclick='purchaseOrder()']")
    WebElement purchaseBtn;

    //PopUp message
    @FindBy(className = "sa-success")
    WebElement successMessage;
    @FindBy(css = ".sweet-alert h2")
    WebElement msgTitle;

    public PlaceOrderPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void fillName(String name) {
        this.name.sendKeys(name);
    }

    public void fillCountry(String country) {
        this.country.sendKeys(country);
    }

    public void fillCity(String city) {
        this.city.sendKeys(city);
    }

    public void fillCard(String card) {
        this.card.sendKeys(card);
    }

    public void fillMonth(String month) {
        this.month.sendKeys(month);
    }

    public void fillYear(String year) {
        this.year.sendKeys(year);
    }

    public void clickPurchaseBtn() {
        this.purchaseBtn.click();
    }

    public void verifySuccessMessageTitle(String title) {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertEquals(title, msgTitle.getText());
    }
}
