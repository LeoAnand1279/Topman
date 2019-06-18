 package com.top.stepdefinition;

import com.top.objectrepository.Size;
import com.top.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class SizeSteps extends FunctionalLibrary {

@When("The user selects the size and adds to bag")
public void the_user_selects_the_size_and_adds_to_bag() {
   Size siz=new Size();
   selectByValue(siz.getSizes(), "30S");
   click(siz.getAddtobag());
}
}
