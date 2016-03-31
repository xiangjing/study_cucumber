Feature: test login

  Scenario Outline: test login trello
    Given Trello login page has been opened
    And Input user name "<arg0>"and password "<arg1>"
    And Click login
    Then login success
    Examples:
      | arg0   | arg1   |
      | xiangjing_cuit@163.com | Xjay19911 |
