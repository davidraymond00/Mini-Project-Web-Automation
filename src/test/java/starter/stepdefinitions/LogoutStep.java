package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutStep {

    @Steps
    LogoutPage logoutPage;
    @And("I click human button")
    public void iClickHumanButton() {
        logoutPage.humanBtn();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.logoutBtn();
    }

    @And("I go to dashboardd")
    public void iGoToDashboardd() {
        logoutPage.dashboard();
    }
}
