Feature: User Login

  Scenario: User can login with invalid username and password
    Given User visited the portal
    When User inputs valid "admin" and "123"
    Then User can see error message

  Scenario: User can login with invalid username and password
    Given User visited the portal
    When User inputs valid "Admin" and "admin123"
    Then User can visit the dashboard




