package com.xfleetSolucition.step_definitions;

import com.xfleetSolucition.pages.XFleetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import com.xfleetSolucition.utilities.Driver;

public class XFleetStep_Definitions {
    XFleetPage xfleetPage =new XFleetPage();

    @Given("user must be able to enter {string}")
    public void user_must_be_able_to_enter(String string) {
        //Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        xfleetPage.inputNameBox.sendKeys(string);
    }
    @Given("user must be able to enter_p {string}")
    public void user_must_be_able_to_enter_p(String string) {
       xfleetPage.passwordBox.sendKeys(string);
    }

    @Given("user must be click to login button")
    public void user_must_be_click_to_login_button() {
        xfleetPage.logButton.click();
    }
    @Given("driver should land on the quick Launchpad page")
    public void driver_should_land_on_the_quick_launchpad_page() {
        Assert.assertTrue(xfleetPage.quickLaunchpad.isDisplayed());
        xfleetPage.userMenu.click();
        xfleetPage.logoutButton.click();
    }

    @Given("invalid login user name {string}")
    public void invalid_login_user_name(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        xfleetPage.inputNameBox.sendKeys(string);

    }
    @Given("invalid login password {string}")
    public void invalid_login_password(String string) {
        xfleetPage.passwordBox.sendKeys(string);
    }

    @And("user clicks to login button in zfleet")
    public void userClicksToLoginButtonInXfleet() {
        xfleetPage.logButton.click();
    }

    @Given("enpty username and password")
    public void enpty_username_and_password() {

    }
    @Given("forgot password clickable")
    public void forgot_password_clickable() {

    }
    @Given("User can see Remember Me link exists and is clickable on the login page")
    public void user_can_see_remember_me_link_exists_and_is_clickable_on_the_login_page() {

    }


    @And("verify  not login")
    public void verifyNotLogin() {
        Assert.assertTrue(xfleetPage.invalidInformations.isDisplayed());
    }

    @And("managers should land on the quick Launchpad page")
    public void managersShouldLandOnTheQuickLaunchpadPage() {
        Assert.assertTrue(xfleetPage.dashBoard.isDisplayed());
    }

    @And("user click login button")
    public void userClickLoginButton() {

    }
}
