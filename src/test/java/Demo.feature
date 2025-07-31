Feature: Testing login to OracleHRM.
 Background:
 Given  user is on login page.

   @Smoke
  Scenario: Testing valid login to OracleHRM

    When user enters "Admin" as userID.
    And  "admin123" as password.
    And clicks on login Button.
    Then user should be navigated to homepage.

   @Regression
    Scenario Outline: Testing login with multiple set of data
       When user enters "<userId>" as UserId and "<password>" as Password
      And clicks on login Button.
      Then user should be navigated to homePAge for valid Data and error message is thrown.
      Examples:
        | userId | password |
        | Ravi   | admin123 |
        | Admin  | admin123 |
        |        |          |


