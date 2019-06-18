package com.top.stepdefinition;

import com.top.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;

public class CommonSteps extends FunctionalLibrary {
	@Given("The user enters to the homepage")
	public void the_user_enters_to_the_homepage() {
	   driver.get("https://www.topman.com/"); 
	}

}
