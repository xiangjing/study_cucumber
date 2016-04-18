Feature: test creat board

  Scenario Outline: creat new board
    Given Has successfully logged in trello
    And Click creat new board
    And Input title"<arg0>"
    And Click creat
    Then Creat success
    Examples:
      | arg0 |
      | testboard |

    #----------------重新规范 Scenarion -------------------------

  Scenario Outline: creat a new board
    Given Has successfully logged in trello
    When Click create board enter the title"<arg0>" and select team"<arg1>" then click creat
    Then Creat board success
    Examples:
      | arg0  | arg1 |
      |title1 | none |
      |title2 |team2 |

  Scenario:

