package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PlaceOrderPage;

import java.util.Map;

import static stepDefinitions.Hooks.driver;

public class PlaceOrderPageStepDef {

    PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);

    @Then("User fills in the order details:")
    public void fillOrderDetails(DataTable table) {
        Map<String, String> orderDetails = table.asMaps().get(0);
        placeOrderPage.fillName(orderDetails.get("Name"));
        placeOrderPage.fillCountry(orderDetails.get("Country"));
        placeOrderPage.fillCity(orderDetails.get("City"));
        placeOrderPage.fillCard(orderDetails.get("Credit Card"));
        placeOrderPage.fillMonth(orderDetails.get("Month"));
        placeOrderPage.fillYear(orderDetails.get("Year"));
        placeOrderPage.clickPurchaseBtn();
    }

    @And("User verifies the success message title {string}")
    public void verifySuccessMessageTitle(String title) {
        placeOrderPage.verifySuccessMessageTitle(title);
    }

}
