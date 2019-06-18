
@tag
Feature: To select the jeans

  @tag1
  Scenario: The user selects the jeans
    Given The user enters to the homepage
    When The user clicks the jeans module & clicks the slim jeans module
    And The user clicks an item
    And The user selects the size and adds to bag
    Then The user validate the add to cart button

  