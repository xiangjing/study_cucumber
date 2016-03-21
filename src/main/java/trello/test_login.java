package trello;

import cucumber.api.java.Before;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-21.
 */
public class test_login {
    WebDriver dr;

    @Before
    public void init() {
        dr = new FirefoxDriver();
    }

    @假设("^trello登录页面已经打开$")
    public void trello登录页面已经打开() throws Throwable {

        dr.get("https://www.trello.com");

    }

    @当("^输入用户名\"([^\"]*)\"和密码\"([^\"]*)\"$")
    public void 输入用户名和密码(String arg0, String arg1) throws Throwable {
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys(arg0);
        dr.findElement(By.id("password")).sendKeys(arg1);

    }

    @当("^点击登录$")
    public void 点击登录() throws Throwable {
        dr.findElement(By.id("login")).click();
      System.out.print("登录成功");
    }

    @那么("^登录成功了$")
    public void 登录成功了() throws Throwable {
        System.out.print("登录成功");
    }
}
