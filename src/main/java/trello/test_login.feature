#language:zh-CN

  功能:测试成功登录


    场景大纲: 打开trello并登录
      假设 trello登录页面已经打开
      当 输入用户名"<arg0>"和密码"<arg1>"
      当 点击登录
      那么 登录成功了
      例子:
        | arg0                   | arg1      |
        | xiangjing_cuit@163.com | Xjay19911 |