package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pages.ItemPage.ItemPricePage;
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
    @FindBy(className = "lead")
    WebElement msgDetails;

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

    public void verifySuccessMessageDetails(String cardNumber, String name) {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        String text = msgDetails.getText();
        System.out.println("Order Details:\n" + text);

        Pattern idPattern = Pattern.compile("Id:\\s(\\d+)");
        Matcher idMatcher = idPattern.matcher(text);

        Assert.assertTrue("Id order does not contain a number!", idMatcher.find());
        Assert.assertTrue("Total amount in not correct "  + ItemPricePage ,
                text.contains("Amount: " + ItemPricePage + " USD"));

        Assert.assertTrue("Card Number is not correct "  + cardNumber ,
                text.contains("Card Number: " + cardNumber));

        Assert.assertTrue("Name is not correct " + name, text.contains("Name: " + name));

        String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("M/d/yyyy"));
        Assert.assertTrue("Date is not correct " + todayDate, text.contains("Date: " + todayDate));
    }
}
