package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;

import static stepDefinitions.Hooks.driver;

public class CartPageStepDef {

    CartPage cartPage = new CartPage(driver);

    @Then("User verifies the item is added to the cart and price")
    public void user_verifies_the_item_is_added_to_the_cart() {
        cartPage.verifyItemInCart();
        cartPage.verifyTotalPrice();
    }

    @And("User clicks on place the order")
    public void user_places_the_order() {
        cartPage.placeOrder();
    }

}
