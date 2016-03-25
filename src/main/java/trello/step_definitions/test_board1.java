package trello.step_definitions;

import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-25.
 */
public class test_board1 {

    WebDriver dr1;
    @假设("^已经成功登录trello$")
    public void 已经成功登录trello() throws Throwable {
        dr1 = new FirefoxDriver();
        dr1.get("https://www.trello.com");
        dr1.findElement(By.className("quiet")).click();
        dr1.findElement(By.id("user")).sendKeys("xiangjing_cuit@163.com");
        dr1.findElement(By.id("password")).sendKeys("Xjay19911");
        dr1.findElement(By.id("login")).click();
        Thread.sleep(10000);
    }

    @当("^点击Creat new board$")
    public void 点击creatNewBoard() throws Throwable {
        dr1.findElement(By.className("header-btn-text")).click();
        Thread.sleep(1000);
        dr1.findElement(By.className("boards-drawer is-shown"));
        dr1.findElement(By.className("quiet-button js-add-board"));
    }

    @当("^input Title\"([^\"]*)\"$")
    public void inputTitle(String arg0) throws Throwable {

    }

    @那么("^创建成功$")
    public void 创建成功() throws Throwable {
    }


}
