package step_definitions;

import cucumber.api.java.zh_cn.����;
import cucumber.api.java.zh_cn.��;
import cucumber.api.java.zh_cn.��ô;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-21.
 */
public class test_login {
    WebDriver dr;

    @����("^trello��¼ҳ���Ѿ���$")
    public void trello��¼ҳ���Ѿ���() throws Throwable {
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
    }

    @��("^�����û���\"([^\"]*)\"������\"([^\"]*)\"$")
    public void �����û���������(String arg0, String arg1) throws Throwable {
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys(arg0);
        dr.findElement(By.id("password")).sendKeys(arg1);
    }

    @��("^�����¼$")
    public void �����¼() throws Throwable {
        dr.findElement(By.id("login")).click();
        Thread.sleep(100000);
    }

    @��ô("^��¼�ɹ���$")
    public void ��¼�ɹ���() throws Throwable {
        if(dr.getCurrentUrl().equals("https://trello.com/") ){
            System.out.println("ͨ����");
        }
        else {
            System.out.println("��ͨ��");
        }
        System.out.println(dr.getCurrentUrl());
    }

    @��ô("^��¼ʧ��$")
    public void ��¼ʧ��() throws Throwable {
        if(dr.getCurrentUrl().equals("https://trello.com/login") ){
            System.out.println("ͨ��");
        }
        else {
            System.out.println("��ͨ��");
        }
        System.out.println(dr.getCurrentUrl());
    }
}
