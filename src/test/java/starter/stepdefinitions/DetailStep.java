package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;

public class DetailStep {

    @Steps
    DetailPage detailPage;

    @Given("I on the dashboard page")
    public void iOnTheDashboardPage() {
        detailPage.openUrl();
    }


    @When("I click detail product PS 5 star 5")
    public void iClickDetailProductPS5Star5() {
        detailPage.detailBtn();
    }

    @Then("I go to detail information")
    public void iGoToDetailInformation() {
        detailPage.infrmation();
    }

    @When("I click detail product PS 5 star 3")
    public void iClickDetailProductPS5Star3() {
        detailPage.detailBtn();
    }

    @When("I click detail product PS 5 no star")
    public void iClickDetailProductPS5NoStar() {
        detailPage.detailBtn();
    }

    @When("I click detail product Samsung PS 5 star 5")
    public void iClickDetailProductSamsungPS5Star5() {
        detailPage.detailBtn();
    }
}
