package org.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.base.BaseClass;
import org.junit.*;

import org.junit.*;

public class LoginSteps extends BaseClass  {
	static WebDriver driver;
@Given("the user should be in login page")
public void the_user_should_be_in_login_page() {
//	BrowserLaunch("chrome");
//	urlLaunch("https://www.kayak.co.in/flights");
//	maximize();
//	implicitlyWait(15);
//	
//  WebDriverManager.chromedriver().setup();
//  driver=new ChromeDriver();
//  driver.manage().window().maximize();
//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//  driver.get("https://www.kayak.co.in/flights");
}

@When("the user has select the travel date")
public void the_user_has_select_the_travel_date() {
	WebElement toplace = driver.findElement(By.xpath("(//input[@class='k_my-input'])[4]"));
	toplace.sendKeys("america");
	
	WebElement selclick = driver.findElement(By.xpath("//span[@class='sR_k-value']"));
	selclick.click();
 System.out.println("okay");
}

@When("then click the button")
public void then_click_the_button() throws InterruptedException {
	  WebElement dateclick = driver.findElement(By.xpath("//div[text()='18']"));
	   dateclick.click();
	   System.out.println("finish");
}
@Then("The user select return date")
public void the_user_select_return_date() throws InterruptedException {
	  WebElement selreclick = driver.findElement(By.xpath("//span[@aria-live='polite']"));
			selreclick.click();
			Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your email address']"));
		email.sendKeys("sandytambasandy@gmail.com");
			
			
			
			
			WebElement b = driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-submit']"));
			b.click();
			//Assert.assertTrue(false);

   System.out.println("done");  
}
}
