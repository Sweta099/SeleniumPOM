package com.cg.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/Navigate.feature", glue = "com.cg.navigatestepdef", dryRun = false, plugin = {
		"pretty", "json:target/cucmber.json", "html:target/index.html" })
public class Runner3 {

}
