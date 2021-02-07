Feature: Application login

  Scenario: Home page default login
    Given User is on the Netbanking  landing page
    When User loging into the application with "def" and "4321"
    Then Home page is populated
    And Cards displayed are "true"

     Scenario: Home page default login
    Given User is on the Netbanking  landing page
    When User loging into the application with "abc" and "1234"
    Then Home page is populated
      And Cards displayed are "false"