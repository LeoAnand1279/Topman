package com.top.stepdefinition;

import org.junit.Assert;

import com.top.objectrepository.ShowCart;

import cucumber.api.java.en.Then;

public class ShowCartSteps {



@Then("The user validate the add to cart button")
public void the_user_validate_the_add_to_cart_button() {
ShowCart show=new ShowCart();
Assert.assertEquals("1", show.getAddCart().getText());
}

}
