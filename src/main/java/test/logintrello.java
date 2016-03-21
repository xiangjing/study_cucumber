package test;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-21.
 */
public class logintrello {

    @假设("^打开trello的页面$")
    public void 打开trello的页面() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriver dr=new FirefoxDriver();
       login lg=new login();
        lg.url(dr);

        dr.get("https://www.trello.com");
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys("xiangjing");
        dr.findElement(By.id("password")).sendKeys("Xjay19911");
        dr.findElement(By.id("login")).click();


    }

    @当("^输入用户名\"([^\"]*)\"$")
    public void 输入用户名(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


    @当("^输入密码\"([^\"]*)\"$")
    public void 输入密码(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @当("^点击login$")
    public void 点击login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @那么("^登录成功$")
    public void 登录成功() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
