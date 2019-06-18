package com.top.stepdefinition;

import com.top.objectrepository.SlimJeans;
import com.top.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class SlimJeansPage extends FunctionalLibrary {


@When("The user clicks an item")
public void the_user_clicks_an_item() {
   SlimJeans slim=new SlimJeans();
  click(slim.getSelectJeans());
}
}
