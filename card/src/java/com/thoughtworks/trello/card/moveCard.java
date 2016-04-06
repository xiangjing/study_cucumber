package com.thoughtworks.trello.card;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Thoughtworks on 16-4-5.
 */
public class moveCard {

    WebDriver dr;


    @Given("^Has successfully open a board of have list a$")
    public void hasSuccessfullyOpenABoardOfHaveListA() throws Throwable {
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys("xiangjing_cuit@163.com");
        dr.findElement(By.id("password")).sendKeys("Xjay19911");
        dr.findElement(By.id("login")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dr.findElement(By.className("js-react-root")).
                findElement(By.cssSelector("a[data-reactid^='.0.0.1.1.$56fa35db01a1ccf5712fd31b.0']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @And("^choose a card and move it thought dragAndDrop$")
    public void chooseACardAndMoveItThoughtDragAndDrop() throws Throwable {
        WebElement element=dr.findElement(By.cssSelector("div[class='u-fancy-scrollbar js-no-higher-edits js-list-sortable ui-sortable']")).
                findElement(By.xpath("//div[1][contains(@class,'js-list list-wrapper')]")).
                findElement(By.cssSelector("div[class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']")).
                findElement(By.xpath("//div[1][contains(@class,'list-card js-member-droppable ui-droppable')]"));
        //findElement(By.cssSelector("div[class='list-card js-member-droppable ui-droppable']"));
        WebElement target=dr.findElement(By.cssSelector("div[class='u-fancy-scrollbar js-no-higher-edits js-list-sortable ui-sortable']")).
                findElement(By.xpath("//div[2][contains(@class,'js-list list-wrapper')]"));
        Actions action=new Actions(dr);
        action.dragAndDrop(element,target).perform();
    }

    @And("^choose a card$")
    public void chooseACard() throws Throwable {
        dr.findElement(By.cssSelector("div[class='u-fancy-scrollbar js-no-higher-edits js-list-sortable ui-sortable']")).
                findElement(By.xpath("//div[1][contains(@class,'js-list list-wrapper')]")).
                findElement(By.cssSelector("div[class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']")).
                findElement(By.xpath("//div[1][contains(@class,'list-card js-member-droppable ui-droppable')]")).click();

    }

    @And("^choose move$")
    public void chooseMove() throws Throwable {
        dr.findElement(By.xpath("//a[@class='button-link js-move-card']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("^choose board list and position$")
    public void chooseBoardListAndPosition() throws Throwable {
        dr.findElement(By.cssSelector("div[class='pop-over is-shown']")).
                findElement(By.cssSelector("div[class='form-grid']")).
                findElement(By.cssSelector("div[class*='button-link setting form-grid-child form-grid-child-full']")).click();
    }

    @And("^click move$")
    public void clickMove() throws Throwable {

    }
}
