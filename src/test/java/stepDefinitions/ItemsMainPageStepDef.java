package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ItemsMainPage;

import static stepDefinitions.Hooks.driver;

public class ItemsMainPageStepDef {

    ItemsMainPage itemsMainPage = new ItemsMainPage(driver);

    @When("User chooses a random item")
    public void user_chooses_a_random_item() {
        itemsMainPage.chooseRandomItem();
    }
}
