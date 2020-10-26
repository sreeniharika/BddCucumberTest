Feature: Register new user

  Scenario: verify user is able to register with valid data
    Given I navigate to "https://demo.nopcommerce.com/"
    Then I should see home page
    When I click on register link
    Then I should be navigated to register page