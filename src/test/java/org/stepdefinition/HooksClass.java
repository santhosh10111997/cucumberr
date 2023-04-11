package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass {
	
	@Before()
	public void beforeScenario() {
		
		System.out.println("before scenario");
		BrowserLaunch("chrome");
        urlLaunch("https://www.kayak.co.in/flights");
        maximize();
        implicitlyWait(10);
       
	}
	
	@After()
	public void AfterScenario(Scenario sc) throws IOException {
		System.out.println("after scenario");
		//String name = sc.getName();
//		if(sc.isFailed()) {
			
//			screenshot(name);
//		}
		
//		TakesScreenshot tk =(TakesScreenshot)driver;
//		
//		byte[] scre = tk.getScreenshotAs(OutputType.BYTES);
//		sc.embed(scre, "image/png");
//		
		quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
