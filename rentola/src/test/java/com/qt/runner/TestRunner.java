package com.qt.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
       features="FeatureFiles",
        glue = {"com.qt.tests"},
        tags="@Login",
     //   monochrome = true,
       // dryRun = true,
        plugin= {"pretty","html:target/cucumber-reports/CucumberTestReport.html"}
        )
public class TestRunner {
	
}

