package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.*;

public class ScrollDownn extends BaseClass {

@When("The user shoud be scroll down the page")
public void the_user_shoud_be_scroll_down_the_page() {
   System.out.println("ok");
   JavascriptExecutor js=(JavascriptExecutor)driver;
 //  js.executeScript("arguments[0].crollIntoView", e);
}

@When("The user select to the particular cuntry")
public void the_user_select_to_the_particular_cuntry() {
System.out.println("finish");
}

@Then("select the particular flights based on here price")
public void select_the_particular_flights_based_on_here_price() {
 quit();
 System.out.println("done");
}
	
}
