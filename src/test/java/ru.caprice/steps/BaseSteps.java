package ru.caprice.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class BaseSteps {

    @Given("^Go to the \"([^\"]*)\"$")
    public void goToThe(String url){
        open(url);
    }


    @Then("^I'm on the page \"([^\"]*)\"$")
    public void iMOnThePage(String url){
        url = baseUrl + url;
        Assert.assertEquals(url(),url);
    }
}
