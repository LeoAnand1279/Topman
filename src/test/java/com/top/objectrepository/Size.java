package com.top.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.top.resources.FunctionalLibrary;

public class Size {
	public Size() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	@FindBy(xpath="//select[@id='productSizes']")
	private WebElement sizes;
	@FindBy(xpath="//button[text()='Add to bag']")
private WebElement Addtobag;
	public WebElement getSizes() {
		return sizes;
	}
	public WebElement getAddtobag() {
		return Addtobag;
	}
	
}
