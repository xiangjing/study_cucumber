package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Thoughtworks on 16-3-21.
 */
public class login {

    public void url(WebDriver dr){

        dr.get("https://www.trello.com");
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys("xiangjing");
    }




}
