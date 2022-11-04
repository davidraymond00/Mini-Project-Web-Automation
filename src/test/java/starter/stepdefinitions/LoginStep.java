package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage(){
        loginPage.openUrl();
    }

    @When("I input null email")
    public void iInputNullEmail() {
        loginPage.inputEmail("");
    }

    @And("I input null password")
    public void iInputNullPassword() {
        loginPage.inputPassword("");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail("siboro321@gmail.com");
    }

    @Then("I will get password required")
    public void iWillGetPasswordRequired() {
        loginPage.errorPasswordMessage();
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("sagalak001");
    }

    @Then("I will get email required")
    public void iWillGetEmailRequired() {
        loginPage.errorMessageDisplayed();
    }

    @When("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("asdasd@yahoo.co.id");
    }

    @Then("I will get record not found")
    public void iWillGetRecordNotFound() {
        loginPage.recordNotFound();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("asdasd");
    }

    @Then("I go to dashboard")
    public void iGoToDashboard() {
        loginPage.loginSucces();
    }
}
