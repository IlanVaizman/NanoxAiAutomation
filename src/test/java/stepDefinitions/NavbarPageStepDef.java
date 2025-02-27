package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.NavbarPage;

import static stepDefinitions.Hooks.driver;

public class NavbarPageStepDef {
    NavbarPage navbarPage = new NavbarPage(driver);

    @Given("User enter login page")
    public void clickLoginBtn() {
        navbarPage.clickLoginBtn();
    }

    @Then("User connect msg is {string}")
    public void verifyUserName(String name) {
        navbarPage.verifyUserName(name);
    }
}
