package com.cucumber.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,												
        features = "src/test/java/com/cucumber/features",
        glue = "com.cucumber.stepdefinitions",
        plugin = {"pretty", "json:target/cucumber.json"}
        )
public class Runner extends AbstractTestNGCucumberTests {

	@AfterSuite()
	public void teardown() throws Exception
	{
		 	CucumberDetailedResults results = new CucumberDetailedResults();
	        results.setOutputDirectory("target/");
	        results.setOutputName("cucumber");
	        results.setSourceFile("target/cucumber.json");
	        results.executeDetailedResultsReport(false);
	}
}