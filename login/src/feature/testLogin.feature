Feature: test login

  Scenario Outline: test login trello
    Given Trello login page has been opened
    And Input user name "<arg0>"and password "<arg1>"
    And Click login
    Then login success
    Examples:
      | arg0   | arg1   |
      | xiangjing_cuit@163.com | Xjay19911 |

    #重新规范 Scenario ##############################

  Scenario Outline: Login successful
    Given Open the login page
    When Enter the correct user name "<arg0>" and password"<arg1>" and click login
    Then Login successful
    Examples:
      | arg0     | arg1     |
      | username | password |


  Scenario Outline: Login failed
    Given Open the login page
    When Enter the error user name "<arg0>" and password"<arg1>" and click login
    Then Login failed
    Examples:
      | arg0   | arg1   |
      | 123213 | 124324 |
      |        |        |
      |        |123     |
      |123     |        |

  Scenario Outline: Input frame element test
    Given Open the login page
    When Enter user name "<arg0>" and password "<arg1>" that does not conform to the specified
    Then The system gives the corresponding prompt
    Examples:
      | arg0     | arg1     |
      | username | password |