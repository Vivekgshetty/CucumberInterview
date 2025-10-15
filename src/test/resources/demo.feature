Feature: Hover over login button on Flipkart

  Scenario: User hovers mouse over the login button
    Given User on the Flipkart homepage
    When User hover over the login button
    Then the login dropdown should be displayed
