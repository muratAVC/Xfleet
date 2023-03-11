package com.xfleetSolucition.step_definitions;

import com.xfleetSolucition.pages.XFleetPage;
import com.xfleetSolucition.utilities.BrowserUtils;
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
        BrowserUtils.waitForVisibility(xfleetPage.quickLaunchpad,10);
        Assert.assertTrue(xfleetPage.quickLaunchpad.isDisplayed());
        //xfleetPage.userMenu.click();
        //xfleetPage.logoutButton.click();
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
        xfleetPage.logButton.click();
        //String asd=xfleetPage.inputNameBox.getText();
        //System.out.println("selam buradayım");
        if ( user.length()==0 & pass.length()==0 ){
            Assert.assertTrue(xfleetPage.inputNameBox.getAttribute("validationMessage").equals("Please fill out this field."));
            //System.out.println("both empty");
            System.out.println("xfleetPage.inputNameBox.getAttribute(\"validationMessage\") = " + xfleetPage.inputNameBox.getAttribute("validationMessage"));

        }else if (user.length()==0 & pass.length()!=0){
            Assert.assertTrue(xfleetPage.inputNameBox.getAttribute("validationMessage").contains("Please fill out this field."));
            //System.out.println("user is empty");
            System.out.println("xfleetPage.inputNameBox.getAttribute(\"validationMessage\") = " + xfleetPage.inputNameBox.getAttribute("validationMessage"));

        } else if (user.length()!=0 & pass.length()==0){
            Assert.assertTrue(xfleetPage.passwordBox.getAttribute("validationMessage").contains("Please fill out this field."));
            //System.out.println("pass empty");
        }


    }

    @Given("user is forgot password")
    public void userIsForgotPassword() {
        Assert.assertEquals("http://qa.xfleetsolutions.com/user/reset-request", Driver.getDriver().getCurrentUrl());
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
        Assert.assertTrue(xfleetPage.passwordBox.getAttribute("type").contains("password"));
        //Assert.assertEquals("password", xfleetPage.passwordBox.getAttribute("type"));
    }


    @And("user van see own username on profile menu")
    public void userVanSeeOwnUsernameOnProfileMenu() {
        //System.out.println("xfleetPage.userMenu.getText() = " + xfleetPage.userMenu.getText());
        //Assert.assertEquals("John Doe ", xfleetPage.username.getAttribute("innerText"));
        Assert.assertTrue(xfleetPage.username.getAttribute("innerText").contains("John Doe"));
    }

    @Given("open the login page")
    public void openTheLoginPage() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
    }
}
