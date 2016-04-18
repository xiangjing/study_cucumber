package com.thoughtworks.trello.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testLogin {

    WebDriver dr;

    @Given("^Trello login page has been opened$")
    public void trelloLoginPageHasBeenOpened() throws Throwable {
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
    }

    @And("^Input user name \"([^\"]*)\"and password \"([^\"]*)\"$")
    public void inputUserNameAndPassword(String arg0, String arg1) throws Throwable {
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys(arg0);
        dr.findElement(By.id("password")).sendKeys(arg1);
    }


    @And("^Click login$")
    public void clickLogin() throws Throwable {
        dr.findElement(By.id("login")).click();
    }

    @Then("^login success$")
    public void loginSuccess() throws Throwable {
        /*if(dr.getCurrentUrl().equals("https://trello.com/") ){
            System.out.println("123");
        }
        else {
            System.out.println("234");
        }
        */
        System.out.println(dr.getCurrentUrl());
    }

    @Given("^Open the login page$")
    public void openTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Enter the correct user name \"([^\"]*)\" and password\"([^\"]*)\" and click login$")
    public void enterTheCorrectUserNameAndPasswordAndClickLogin(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Login successful$")
    public void loginSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Enter the error user name \"([^\"]*)\" and password\"([^\"]*)\" and click login$")
    public void enterTheErrorUserNameAndPasswordAndClickLogin(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Login failed$")
    public void loginFailed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Enter user name \"([^\"]*)\" and password \"([^\"]*)\" that does not conform to the specified$")
    public void enterUserNameAndPasswordThatDoesNotConformToTheSpecified(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The system gives the corresponding prompt$")
    public void theSystemGivesTheCorrespondingPrompt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
