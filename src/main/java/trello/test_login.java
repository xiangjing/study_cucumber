package trello;

import cucumber.api.java.Before;
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

    @Before
    public void init() {
        dr = new FirefoxDriver();
    }

    @����("^trello��¼ҳ���Ѿ���$")
    public void trello��¼ҳ���Ѿ���() throws Throwable {

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
      System.out.print("��¼�ɹ�");
    }

    @��ô("^��¼�ɹ���$")
    public void ��¼�ɹ���() throws Throwable {
        System.out.print("��¼�ɹ�");
    }
}
