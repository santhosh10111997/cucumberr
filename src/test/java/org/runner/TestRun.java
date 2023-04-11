package org.runner;

import org.base.JvmReportt;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",dryRun=false,
monochrome=true
//plugin= {"pretty",
//		"json:src\\test\\resources\\Reports\\jsonreport.json"
//		
//		
//})
)
public class TestRun {
//	@BeforeClass
//	public static void befor() {
//		System.out.println("start");
//
//	}
//	@AfterClass
//public static void after() {
//	JvmReportt.GenerateJvmReport("json:src\\test\\resources\\Reports\\jsonreport.json");
//	
//	System.out.println("end");

}
	
//}
