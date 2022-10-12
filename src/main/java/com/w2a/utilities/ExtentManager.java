package com.w2a.utilities;

import java.io.File;

import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;




public class ExtentManager {

	
	public static ExtentReports extent;
	public static ExtentReports getInstance(){
			
			if(extent== null){
				
				
				ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.html");
				extent=new ExtentReports();
				extent.attachReporter(htmlReporter);
				//Configuring HTML extent report
				htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\extentconfig\\ReportsConfig.xml"));
				
			}
			
			return extent;
		}
	}
