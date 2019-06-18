package com.top.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.top.resources.FunctionalLibrary;

public class SlimJeans {
	public SlimJeans() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
@FindBy(xpath="(//img[@class='ProductImages-image ProductImages-image--showing'])[3]")
private WebElement SelectJeans;
public WebElement getSelectJeans() {
	return SelectJeans;
}

}
