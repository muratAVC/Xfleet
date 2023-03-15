package com.xfleetSolucition.step_definitions;

import com.xfleetSolucition.pages.XFleetPage;
import com.xfleetSolucition.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class XFleet_LogOut_StepDefinition {

    XFleetPage xFleetPage = new XFleetPage();

    @Given("user is must login")
    public void userIsMustLogin() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        xFleetPage.inputNameBox.sendKeys("user1");
        xFleetPage.passwordBox.sendKeys("UserUser123");
        xFleetPage.logButton.click();
    }

    @Given("user is click to logout button")
    public void userIsClickToLogoutButton() {
        xFleetPage.profilemenu.click();
        xFleetPage.logoutButton.click();

    }

    @And("user can see login page")
    public void userCanSeeLoginPage() {
        Assert.assertTrue(xFleetPage.loginPageText.isDisplayed());
    }
}
