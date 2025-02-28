package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static stepDefinitions.Hooks.driver;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage(driver);

    @Then("User sees the login page")
    public void verifyLoginPage() {
        loginPage.verifyPage();
    }

    @When("User fills in the username field with {string} and the password field with {string}")
    public void fillUsernameAndPasswordFields(String username, String password) {
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
    }

    @And("User clicks on the login button")
    public void clickLoginBtn() {
        loginPage.clickLoginBtn();
    }

    @Then("Show error is {string}")
    public void verifyAlertError(String error) {
        loginPage.verifyAlertError(error);
    }
}
