#language:zh-CN

功能:测试board相关功能


  场景大纲: 创建新的board
    假设 已经成功登录trello
    当 点击Creat new board
    当 input Title"<arg0>"and choice Team<arg1>点击create
    那么 创建成功
    例子:
      | arg0 | arg1 |
    |123   |123   |


