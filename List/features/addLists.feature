Feature: test add List

  Scenario Outline: add List
    Given Has successfully open a board
    And Click add list
    And Input list name"<arg0>"
    And Click save
    Then Add list success
    Examples:
      | arg0 |
      | testboard |
