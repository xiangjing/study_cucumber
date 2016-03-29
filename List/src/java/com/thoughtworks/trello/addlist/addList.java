package com.thoughtworks.trello.addlist;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by Thoughtworks on 16-3-29.
 */
public class addList {
    @Given("^Has successfully open a board$")
    public void hasSuccessfullyOpenABoard() throws Throwable {
        System.out.print("123");
    }

    @And("^Click add list$")
    public void clickAddList() throws Throwable {

    }

    @And("^Input list name\"([^\"]*)\"$")
    public void inputListName(String arg0) throws Throwable {

    }

    @And("^Click save$")
    public void clickSave() throws Throwable {

    }

    @Then("^Add list success$")
    public void addListSuccess() throws Throwable {

    }
}
