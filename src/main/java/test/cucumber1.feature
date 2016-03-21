#language: zh-CN
功能: 任务管理

  场景大纲: 完成1件任务
    假设 我的任务清单里有<totalTasks>个任务
    当 我完成<finishedTasks>件任务之后
    那么 我还剩下<leftTasks>件未完成的任务
    例子:
      | totalTasks | finishedTasks | leftTasks |
      | 3          | 1             | 2         |
      |           5|     3         | 2         |


  场景大纲: 测试两个字符串相加
    假设 我有一个字符串"<arg0>"
    当 我第二个字符串"<arg1>"
    当 我点击登录
    那么 登录成功"<arg2>"
    例子:
      | arg0 | arg1 | arg2 |
    |    123  |   456   |   123456   |


  场景:测试两个字符串相加
    假设 Ihaveone"string1"
    当 ihavetwo"string2"
    当 add
    那么 cehnggong"string1string2"

  场景大纲: 测试打开baidu
    假设 i Have a url "<arg0>"
    例子:
      | arg0                 |
      | http://www.baidu.com |