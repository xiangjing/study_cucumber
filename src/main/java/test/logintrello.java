package test;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.����;
import cucumber.api.java.zh_cn.��;
import cucumber.api.java.zh_cn.��ô;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-21.
 */
public class logintrello {

    @����("^��trello��ҳ��$")
    public void ��trello��ҳ��() throws Throwable {
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

    @��("^�����û���\"([^\"]*)\"$")
    public void �����û���(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


    @��("^��������\"([^\"]*)\"$")
    public void ��������(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @��("^���login$")
    public void ���login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @��ô("^��¼�ɹ�$")
    public void ��¼�ɹ�() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
