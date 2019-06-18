package com.top.stepdefinition;

import com.top.objectrepository.HomePage;
import com.top.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {

@When("The user clicks the jeans module & clicks the slim jeans module")
public void the_user_clicks_the_jeans_module_clicks_the_slim_jeans_module() throws InterruptedException {
  HomePage home=new HomePage();
  
  jsMouseOver(home.getJeans());
  Thread.sleep(3000);
clickjs(home.getSlimjeans());
}
}
