package com.top.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.top.stepdefinition" , monochrome=true,plugin= {"html:target, json.report"})
public class TestRunner {

}
