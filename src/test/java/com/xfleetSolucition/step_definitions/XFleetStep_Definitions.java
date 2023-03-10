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
        xfleetPage.inputNameBox.sendKeys(string);
        //System.out.println("username="+string);
    }
    @Given("user must be able to enter_p {string}")
    public void user_must_be_able_to_enter_p(String string) {
       xfleetPage.passwordBox.sendKeys(string);
        //System.out.println("pass"+string);
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


    @And("user click login button {string} and {string}")
    public void userClickLoginButtonAnd(String user, String pass) {
        if ( user.length()==0 & pass.length()==0 ){
            System.out.println("both empty");

        }else if (user.length()==0 & pass.length()!=0){
            System.out.println("user is empty");

        } else if (user.length()!=0 & pass.length()==0){
            System.out.println("pass empty");
        }


    }

    @Given("user is forgot password")
    public void userIsForgotPassword() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("http://qa.xfleetsolutions.com/user/reset-request"));
    }

    @Given("user click to forgot password button")
    public void userClickToForgotPasswordButton() {
        xfleetPage.forgotPasswordButton.click();
    }

    @Given("user click to remember me button")
    public void userClickToRememberMeButton() {
        Assert.assertTrue(xfleetPage.rememberBox.isEnabled());
    }

    @Given("check the signs the password field")
    public void checkTheSignsThePasswordField() {
        Assert.assertTrue(xfleetPage.passwordBox.getAttribute("type").equals("password"));
    }

    @And("user can see username is profile menu")
    public void userCanSeeUsernameIsProfileMenu() {
        Assert.assertTrue(xfleetPage.profilemenu.isDisplayed());
    }
}
