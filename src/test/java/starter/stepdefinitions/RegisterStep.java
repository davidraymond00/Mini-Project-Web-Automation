package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterStep {

    @Steps
    RegisterPage registerPage;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage(){
        registerPage.openUrl();
    }

    @When("I am input null nama")
    public void iAmInputNullNama() {
        registerPage.inputNama("");
    }

    @And("I am input null email")
    public void iAmInputNullEmail() {
        registerPage.inputEmail("");
    }

    @And("I am input null password")
    public void iAmInputNullPassword() {
        registerPage.inputPassword("");
    }

    @And("I am click register button")
    public void iAmClickRegisterButton() {
        registerPage.clickRegButton();
    }

    @Then("I will get email is required")
    public void iWillGetEmailIsRequired() {
        registerPage.emailIsRequired();
    }

    @When("I am input valid nama")
    public void iAmInputValidNama() {
        registerPage.inputNama("david raymond");
    }

    @And("I am input valid email")
    public void iAmInputValidEmail() {
        registerPage.inputEmail("davidsagala@gmail.com");
    }

    @And("I am input valid password")
    public void iAmInputValidPassword() {
        registerPage.inputPassword("okokok");
    }

    @And("I am input ready email")
    public void iAmInputReadyEmail() {
        registerPage.inputEmail("siboro321@gmail.com");
    }

    @And("I am input ready password")
    public void iAmInputReadyPassword() {
        registerPage.inputPassword("sagalak001");
    }

    @And("I am input validd email")
    public void iAmInputValiddEmail() {
        registerPage.inputEmail("david@gmail.com");
    }

    @Then("i will go to login page")
    public void iWillGoToLoginPage() {
        registerPage.succesRegis();
    }
}
