package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;

public class CartStep {

    @Steps
    CartPage cartPage;
    @Given("I on the order page")
    public void iOnTheOrderPage() {
        cartPage.openUrll();
    }

    @When("I click cart button")
    public void iClickCartButton() {
        cartPage.cartBtn();
    }

    @Then("I see item to buy")
    public void iSeeItemToBuy() {
        cartPage.detailInfrmtn();
    }

//    @Given("I on the order page with item")
    public void iOnTheOrderPageWithItem() {
        cartPage.openUrlItem();
    }

//    @When("I click cart button with item")
    public void iClickCartButtonWithItem() {
        cartPage.cartItm();
    }

//    @Then("I see list item to buy")
    public void iSeeListItemToBuy() {
        cartPage.listItem();
    }
}
