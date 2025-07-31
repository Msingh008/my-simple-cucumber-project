Feature: practicing datatable

  Scenario: Login to oracleCRM using datatable
    Given user is on login page.
    When user enters creds.
      | Admin    |
      | admin123 |
    And clicks on login Button.
    Then user should be navigated to homepage.