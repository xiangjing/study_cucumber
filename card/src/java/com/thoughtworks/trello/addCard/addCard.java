package com.thoughtworks.trello.addCard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thoughtworks on 16-3-31.
 */
public class addCard {

    WebDriver dr;
    public static int card;
    @Given("^Has successfully open a board of have list$")
    public void hasSuccessfullyOpenABoardOfHaveList() throws Throwable {
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys("xiangjing_cuit@163.com");
        dr.findElement(By.id("password")).sendKeys("Xjay19911");
        dr.findElement(By.id("login")).click();
        Thread.sleep(10000);
        dr.findElement(By.className("js-react-root")).
                findElement(By.cssSelector("a[data-reactid^='.0.0.1.1.$56fa35db01a1ccf5712fd31b.0']")).click();
        Thread.sleep(10000);

    }

    @And("^Click add card$")
    public void clickAddCard() throws Throwable {
        dr.findElement(By.id("board")).findElement(By.cssSelector("div[class='js-list list-wrapper']"))
                .findElement(By.cssSelector("div[class='list js-list-content']"))
                .findElement(By.cssSelector("a[class='open-card-composer js-open-card-composer']")).click();
    }

    @And("^Input card name\"([^\"]*)\"$")
    public void inputCardName(String arg0) throws Throwable {
            dr.findElement(By.id("board")).findElement(By.cssSelector("div[class='js-list list-wrapper']"))
                    .findElement(By.cssSelector("div[class='list js-list-content']"))
                    .findElement(By.cssSelector("div[class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']"))
                    .findElement(By.cssSelector("textarea[class='list-card-composer-textarea js-card-title']")).sendKeys(arg0);

    }

    @And("^Click save card$")
    public void clickSaveCard() throws Throwable {
        dr.findElement(By.id("board")).findElement(By.cssSelector("div[class='js-list list-wrapper']"))
                .findElement(By.cssSelector("div[class='list js-list-content']"))
                .findElement(By.cssSelector("div[class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']"))
                .findElement(By.cssSelector("input[class='primary confirm mod-compact js-add-card']")).click();

    }

    @Then("^Add card success$")
    public void addCardSuccess() throws Throwable {
        System.out.print("创建成功了");
    }
}
