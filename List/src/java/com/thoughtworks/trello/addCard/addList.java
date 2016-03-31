package com.thoughtworks.trello.addCard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class addList {

    WebDriver dr;
    public static int list;

    @Given("^Has successfully open a board$")
    public void hasSuccessfullyOpenABoard() throws Throwable {
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys("xiangjing_cuit@163.com");
        dr.findElement(By.id("password")).sendKeys("Xjay19911");
        dr.findElement(By.id("login")).click();
        Thread.sleep(10000);
        String str = dr.getCurrentUrl();
        dr.findElement(By.className("js-react-root")).
                findElement(By.cssSelector("a[data-reactid^='.0.0.1.1.$56fa35db01a1ccf5712fd31b.0']")).click();
        Thread.sleep(10000);
    }

    @And("^Click add list$")
    public void clickAddList() throws Throwable {
        dr.findElement(By.cssSelector("div[class='js-add-list list-wrapper mod-add is-idle']")).click();


    }

    @And("^Input list name\"([^\"]*)\"$")
    public void inputListName(String arg0) throws Throwable {
        String listname = arg0+list;
        dr.findElement(By.className("list-name-input")).sendKeys(listname);
        list++;
    }

    @And("^Click save$")
    public void clickSave() throws Throwable {
        dr.findElement(By.cssSelector("input[class='primary mod-list-add-button js-save-edit']")).click();
    }

    @Then("^Add list success$")
    public void addListSuccess() throws Throwable {
        System.out.print("添加成功");
    }
}

