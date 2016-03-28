/*
package trello.step_definitions;

import cucumber.api.java.zh_cn.����;
import cucumber.api.java.zh_cn.��;
import cucumber.api.java.zh_cn.��ô;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test_board1 {

    WebDriver dr1;
    @����("^�Ѿ��ɹ���¼trello$")
    public void �Ѿ��ɹ���¼trello() throws Throwable {
        dr1 = new FirefoxDriver();
        dr1.get("https://www.trello.com");
        dr1.findElement(By.className("quiet")).click();
        dr1.findElement(By.id("user")).sendKeys("xiangjing_cuit@163.com");
        dr1.findElement(By.id("password")).sendKeys("Xjay19911");
        dr1.findElement(By.id("login")).click();
        Thread.sleep(10000);
    }
    public void ���creatNewBoard() throws Throwable {
        dr1.findElement(By.className("header-btn-text")).click();
        Thread.sleep(1000);
        dr1.findElement(By.className("boards-drawer is-shown"));
        dr1.findElement(By.className("quiet-button js-add-board"));
    }

    @��("^input Title\"([^\"]*)\"$")
    public void inputTitle(String arg0) throws Throwable {

    }

    @��ô("^�����ɹ�$")
    public void �����ɹ�() throws Throwable {
    }

    @��("^ֱ�ӵ��Creat new board$")
    public void ֱ�ӵ��creatNewBoard() throws Throwable {
       dr1.findElement(By.cssSelector("a[data-reactid='.0.0.1.1.5.0']")).click();
        Thread.sleep(1000);
    }

    @��("^����board����\"([^\"]*)\"$")
    public void ����board����(String arg0) throws Throwable {
        dr1.findElement(By.cssSelector("div[class='pop-over is-shown']")).findElement(By.cssSelector("input[id='boardNewTitle']")).sendKeys(arg0);

    }

    @��("^���Creat$")
    public void ���creat() throws Throwable {
       dr1.findElement(By.cssSelector("div[class='pop-over is-shown']")).findElement(By.cssSelector(""))
    }
}
*/