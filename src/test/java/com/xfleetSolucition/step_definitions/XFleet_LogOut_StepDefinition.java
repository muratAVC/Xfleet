package com.xfleetSolucition.step_definitions;

import com.xfleetSolucition.pages.XFleetPage;
import com.xfleetSolucition.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Set;

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

    @And("user click to back button")
    public void userClickToBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Given("user is closes the open page")
    public void userIsClosesTheOpenPage() throws InterruptedException {
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("window.open()");
        //open the new tab
        Set<String> winTab;
        String winhandle=Driver.getDriver().getWindowHandle();
        winTab=Driver.getDriver().getWindowHandles();
        String handle="";
        for (String each: winTab ) {
            if (winhandle.equals(each)){
                Driver.getDriver().close();
            }else {
                handle=each;
            }
        }
        Thread.sleep(5);

        Driver.getDriver().switchTo().window(handle);
    }

    @And("user is try login")
    public void userIsTryLogin() throws InterruptedException {
        Driver.getDriver().get("https://qa.xfleetsolutions.com");
        System.out.println("xFleetPage.profilemenu.isDisplayed() = " + xFleetPage.dashBoard.isDisplayed());
        Assert.assertTrue(xFleetPage.dashBoard.isDisplayed());
        Thread.sleep(3);
    }
}
