package com.top.stepdefinition;

import com.top.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
public static void before() {
	FunctionalLibrary.driverInit("Chrome");
}
@After
public static void after() {
	FunctionalLibrary.closeBrowser();
	FunctionalLibrary.quitBrowser();
}
}
