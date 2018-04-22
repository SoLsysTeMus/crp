package ru.caprice;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/ru.caprice/feature/",
		glue= {"ru.caprice/steps/"},
		plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber.json" }
		)


public class TestRunner {
 
}