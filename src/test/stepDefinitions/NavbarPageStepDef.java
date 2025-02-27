package stepDefinitions;

import classTestSetup.ClassTestSetupWeb;

import io.cucumber.java.en.Given;
import pages.NavbarPage;

public class NavbarPageStepDef extends ClassTestSetupWeb {
    NavbarPage navbarPage = new NavbarPage(driver);

    @Given("User clicks on the login button")
    public void clickLoginBtn() {
        navbarPage.clickLoginBtn();
    }
}
