@tag
Feature: Amazon search
  I want to verify Amazon search functionality 
  with multiple inputs

  Background: (common step)
    Given user is on Amazon search page

  @tag1
  Scenario Outline: Verifying Amazon search functionality
    When user enters "<products>" in search bar
    And user clicks on the search button
    Then user validates the search result
    And user close the browser

    Examples: 
      | products |
      | dell     |
      | samsung  |
      | apple    |
      | LG       |

  @tag2
  Scenario: Verifying Amazon sortBy functionality
    When user selects Price:Low to High from sort Dropdown
    Then user validates the sortBy functionality results by checking the products price order
