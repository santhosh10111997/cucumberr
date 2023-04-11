package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportt {
	
	public static  void GenerateJvmReport(String json) {
	File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");	
    
	Configuration con=new Configuration(loc, "kayak");
	con.addClassifications("system", "santhosh");
	con.addClassifications("os name", "windows 8");
	con.addClassifications("browsername", "chrome");
	con.addClassifications("Environment", "QA");
	
	
	List<String> jsf=new LinkedList<String>();
	jsf.add(json);
	
	ReportBuilder r=new ReportBuilder(jsf, con);
	r.generateReports();
	
	}

}