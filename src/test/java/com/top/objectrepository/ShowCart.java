package com.top.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.top.resources.FunctionalLibrary;

public class ShowCart {
	public ShowCart() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	@FindBy(xpath="//span[@class='ShoppingCart-itemsCount']")
	private WebElement addCart;
	public WebElement getAddCart() {
		return addCart;
	}
	
}
