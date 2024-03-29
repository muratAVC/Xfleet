@XFLEET10-541
Feature: XFleet user  Feature

  Background: user open the login page
    Given open the login page

  @XFLEET10-532
  Scenario Outline: Driver should land on the "Quick Launchpad" page after successful login
    Given user must be able to enter "<username>"
    And user must be able to enter_p "<password>"
    And user must be click to login button
    And driver should land on the quick Launchpad page

    Examples: username  and Password
      | username | password    |
      | user45   | UserUser123 |
      | user1    | UserUser123 |
      | user2    | UserUser123 |
      | user3    | UserUser123 |
      | user4    | UserUser123 |

  @XFLEET10-533
  Scenario Outline: Sales Manager/ Store Manager should land on the "Dashboard" page after successful login
    Given user must be able to enter "<username>"
    And user must be able to enter_p "<password>"
    And user must be click to login button
    And managers should land on the quick Launchpad page

    Examples: username and password
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager124 | UserUser123 |
      | storemanager53  | UserUser123 |
      | salesmanager276 | UserUser123 |
      | storemanager55  | UserUser123 |
      | salesmanager141 | UserUser123 |

  @XFLEET10-534
  Scenario Outline: Invalid username login
    Given invalid login user name "<invalidUserName>"
    And invalid login password "<invalidPassword>"
    And user must be click to login button
    And verify  not login
    Examples:
      | invalidUserName | invalidPassword |
      | KemalAtaturk    | UserUser123     |
      | _user45         | UserUser123     |
      | 45user45        | UserUser123     |
      | /user45/        | UserUser123     |
      | User1           | UserUser123     |
      | user 45         | UserUser123     |

  @XFLEET10-535
  Scenario Outline: Please fill out this field
    Given user must be able to enter "<username>"
    And user must be able to enter_p "<password>"
    And user click login button "<username>" and "<password>"

    Examples: Username and Password
      | username | password    |
      |          |             |
      |          | UserUser123 |
      | user2    |             |

  @XFLEET10-536
  Scenario: when user is forgot password
    Given user click to forgot password button
    And user is forgot password


  @XFLEET10-537
  Scenario: is clickable of remember me check box
    Given user click to remember me button

  @XFLEET10-538
  Scenario: User should see the password in bullet signs by default
    Given check the signs the password field

  @XFLEET10-539
  Scenario Outline: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page
    Given user must be able to enter "<username>"
    And user must be able to enter_p "<password>"
    And user send the EnterKey
    And user can see profile menu

    Examples: Username and password informations
      | username        | password    |
      | user1           | UserUser123 |
      | storemanager51  | UserUser123 |
      | salesmanager142 | UserUser123 |


  @XFLEET10-540
  Scenario Outline: All users can see their own usernames in the profile menu, after successful login
    Given user must be able to enter "<username>"
    And user must be able to enter_p "<password>"
    And user must be click to login button
    And user van see own username on profile menu

    Examples: Username and password informations
      | username        | password    |
      | user165         | UserUser123 |
      | storemanager52  | UserUser123 |
      | salesmanager141 | UserUser123 |














