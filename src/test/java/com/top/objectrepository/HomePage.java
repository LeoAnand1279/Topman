package com.top.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.top.resources.FunctionalLibrary;

public class HomePage  {
	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
@FindBy(xpath="//a[contains(text(),'Jeans')]")
private WebElement Jeans;
@FindBy(xpath="//span[contains(text(),'Slim Jeans')]")
private WebElement Slimjeans;
public WebElement getJeans() {
	return Jeans;
}
public WebElement getSlimjeans() {
	return Slimjeans;
}

}
