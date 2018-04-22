package ru.caprice.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CSSteps {

    @Before
    public void config(){
        Configuration.pageLoadStrategy="none";
        Configuration.baseUrl="https://www.carprice.ru";
        Configuration.browser="chrome";
    }

    @When("^I go to the MainPage$")
    public void iGoToTheMainPage()  {
        open(baseUrl);
    }

    @Then("^I select brand (.*)$")
    public void userSelectBrand(String brand) {

        $(byText("Марка")).click();
        ElementsCollection selectValues = $$(By.className("Select-option"));
        $(By.id("react-select-2--value")).$(".Select-input > input").setValue(brand);
        $(".Select-option").click();
    }

    @Then("^I select year (.*)$")
    public void userSelectYear(String year)  {
        $(byText("Год")).click();
        $(By.id("react-select-3--value")).$(".Select-input > input").setValue(year);
        $(".Select-option").click();
    }

    @Then("^I select model (.*)$")
    public void userSelectModel(String model)  {
        $(byText("Модель")).click();
        $(By.id("react-select-4--value")).$(".Select-input > input").setValue(model);
        $(".Select-option").click();
    }

    @Then("^I enter Email (.*)$")
    public void userEnterEmail(String email)  {
        $x("//div[@class=\"evaluate__step\"]//input[@name=\"email\"]").setValue(email);
    }

    @Then("^I click button (.*)$")
    public void userClickNextButton(String buttonText)  {
        $x("//div[@class=\"evaluate__step\"]//button").click();
        $(By.name("evaluateStep2")).waitUntil(Condition.visible,timeout);
    }

    @When("^I select city (.*)$")
    public void iSelectCity(String city)  {
        SelenideElement element = $(By.name("evaluateStep2")).$(By.id("react-select-8--value"));
        if(!element.getText().equals(city) && city != null) {
            element.click();
            $(By.id("react-select-8--value")).$(".Select-input > input").setValue(city);
            $(".Select-option").click();
        }
    }

    @And("^I select branch (.*)$")
    public void iSelectBranch(String branch)  {
        $(By.name("evaluateStep2")).$(byText("Москва и МО")).click();
        $(By.id("react-select-9--value")).$(".Select-input > input").setValue(branch);
        $(".Select-option").click();
    }

    @And("^I select date (.*)$")
    public void iSelectDate(String date)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select time (.*)$")
    public void iSelectTime(String time)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter name (.*)$")
    public void iEnterName()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter phone (.*)$")
    public void iEnterPhone()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
