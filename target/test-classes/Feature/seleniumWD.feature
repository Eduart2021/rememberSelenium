Feature: Selenium webDriver test
  Scenario: get name on first link text
    Given the url
    And find the webDriver linkText
    Then verify the header is WebDriver
    And verify tagName is h1