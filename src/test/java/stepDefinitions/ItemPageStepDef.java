package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ItemPage;

import static stepDefinitions.Hooks.driver;

public class ItemPageStepDef {

    ItemPage itemPage = new ItemPage(driver);

    @And("User adds the item to the cart")
    public void user_adds_the_item_to_the_cart() {
        itemPage.setAddToCart();
    }

    @Then("Verify the alert message {string}")
    public void user_verifies_the_alert_message(String msg) {
        itemPage.verifyAlertMsg(msg);
    }
}
