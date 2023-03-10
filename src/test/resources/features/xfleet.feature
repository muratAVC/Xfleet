Feature: XFleet user  Feature

  @Drivers
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

  @Managers
  Scenario Outline: Sales Manager/ Store Manager should land on the "Dashboard" page after successful login
    Given user must be able to enter "<username>"
    And user must be able to enter_p "<password>"
    And user must be click to login button
    And managers should land on the quick Launchpad page

    Examples: username and password
      | username       | password    |
      | storemanager51 | UserUser123 |
      | storemanager52 | UserUser123 |
      | storemanager53 | UserUser123 |
      | storemanager54 | UserUser123 |
      | storemanager55 | UserUser123 |

  @InvalidUser
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

    Scenario Outline: Please fill out this field
      Given user must be able to enter "<username>"
      And user must be able to enter_p "<password>"
      And user click login button

      Examples: Username and Pssword
        | username | password    |
        |          |             |
        |          | UserUser123 |
        | user2    |             |



