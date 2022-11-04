package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutStep {

    @Steps
    LogoutPage logoutPage;
    @Given("I am on the dashboard page")
    public void iAmOnTheDashboardPage(){
        logoutPage.openUrl();
    }

    @When("I click ikon")
    public void iClickIkon() {
        logoutPage.ikonB();
    }

    @Then("I go to login page")
    public void iGoToLoginPage() {
        logoutPage.loginPage();
    }
}
