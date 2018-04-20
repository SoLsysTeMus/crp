package ru.caprice.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class CSSteps {

    @Then("^I select brand (.*)$")
    public void userSelectBrandBrand(String brand) {
    }

    @Then("^I select year (.*)$")
    public void userSelectYearYear(Integer year)  {
    }

    @Then("^I select model (.*)$")
    public void userSelectModelModel(String model)  {
    }

    @Then("^I enter Email (.*)$")
    public void userEnterEmail(String email)  {
    }

    @Then("^I click button (.*)$")
    public void userClickNextButton()  {

    }

    @When("^I go to the MainPage$")
    public void iGoToTheMainPage()  {
        open(baseUrl);
    }

    @When("^I select city (.*)$")
    public void iSelectCityCity()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select branch (.*)$")
    public void iSelectBranchBranch()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select date (.*)$")
    public void iSelectDateDate()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select time (.*)$")
    public void iSelectTimeTime()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter name (.*)$")
    public void iEnterNameName()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter phone (.*)$")
    public void iEnterPhonePhone()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
