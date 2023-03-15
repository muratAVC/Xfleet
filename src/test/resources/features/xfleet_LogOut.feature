@Logout
Feature: As a user, I should be able to log out

  Background: Before user is must be login
    Given user is must login



  Scenario: The user can log out by using the log out button inside profile info and
            the User should land on the "Login" page after logging out.
      Given user is click to logout button
      And user can see login page


  Scenario: The user can not go to the home page again by clicking the
            step back button after successfully logging out.


  Scenario: The user must be logged out if the user closes the open tab
            (all tabs if there are multiple open tabs)



  Scenario: The user must be logged out if the user is away from the keyboard for 3 minutes (AFK)
  (if the user does not do any  mouse or keyboard action for 3 minutes)