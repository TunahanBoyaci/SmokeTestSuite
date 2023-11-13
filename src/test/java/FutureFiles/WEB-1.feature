Feature: Display User Input Message
  As a user, I should be able to navigate to Simple Form Demo page, enter given input, click the button, and display it.

  Scenario: Scenario for Display User Input Message
    Given I am on the web page
    And I navigate to the SimpleFormDemo
    And I enter the "Hello" to the Enter Message section
    When I click to Show Message button
    Then I am able to see "Hello" at the Your Message section