package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PlaceOrderPage;

import static stepDefinitions.Hooks.driver;

public class PlaceOrderPageStepDef {

    PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);

    @Then("User fills the details on the place order page" +
            " with {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillOrderDetails(String name, String country, String city, String card, String month, String year) {
        placeOrderPage.fillName(name);
        placeOrderPage.fillCountry(country);
        placeOrderPage.fillCity(city);
        placeOrderPage.fillCard(card);
        placeOrderPage.fillMonth(month);
        placeOrderPage.fillYear(year);
        placeOrderPage.clickPurchaseBtn();
    }

    @And("User verifies the success message title {string}")
    public void verifySuccessMessageTitle(String title) {
        placeOrderPage.verifySuccessMessageTitle(title);
    }

}
