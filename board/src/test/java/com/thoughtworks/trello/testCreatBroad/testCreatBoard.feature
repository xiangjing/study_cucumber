Feature: test creat board

  Scenario Outline: creat board
    Given Has successfully logged in trello
    And Click creat new board
    And Input title"<arg0>"
    And Click creat
    Then Creat success
    Examples:
      | arg0 |
      | testboard |
