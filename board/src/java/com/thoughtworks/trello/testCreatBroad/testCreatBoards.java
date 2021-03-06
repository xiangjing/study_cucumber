package com.thoughtworks.trello.testCreatBroad;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-28.
 */
public class testCreatBoards {
    WebDriver dr;


    @Given("^Has successfully logged in trello$")
    public void hasSuccessfullyLoggedInTrello() throws Throwable {
        System.out.print("2");
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys("xiangjing_cuit@163.com");
        dr.findElement(By.id("password")).sendKeys("Xjay19911");
        dr.findElement(By.id("login")).click();
        Thread.sleep(10000);
    }

    @And("^Click creat new board$")
    public void clickCreatNewBoard() throws Throwable {
        dr.findElement(By.cssSelector("a[class='board-tile mod-add']")).click();
        Thread.sleep(1000);
    }

    @And("^Input title\"([^\"]*)\"$")
    public void inputTitle(String arg0) throws Throwable {
        dr.findElement(By.cssSelector("div[class='pop-over is-shown']")).
                findElement(By.cssSelector("input[id='boardNewTitle']")).sendKeys(arg0);
    }

    @And("^Click creat$")
    public void clickCreat() throws Throwable {
        dr.findElement(By.cssSelector("div[class='pop-over is-shown']")).
                findElement(By.cssSelector("input[class='primary wide js-submit']")).click();
    }


    @Then("^Creat success$")
    public void creatSuccess() throws Throwable {
        System.out.print("创建成功啦");
    }

    @When("^Click create board enter the title\"([^\"]*)\" and select team\"([^\"]*)\" then click creat$")
    public void clickCreateBoardEnterTheTitleAndSelectTeamThenClickCreat(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Creat board success$")
    public void creatBoardSuccess() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
