Feature: test add card

  Scenario Outline: add card
    Given Has successfully open a board of have list
    And Click add card
    And Input card name"<arg0>"
    And Click save card
    Then Add card success
    Examples:
      | arg0 |
      | testcard |