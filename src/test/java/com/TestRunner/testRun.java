package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
					
					         //features= {".//Features/regression.feature"},
	                         // features= {".//Features/"}, 
							 //features= {".//Features/Hackthon.feature"},
							 features= {".//Features/smoke.feature"},
					glue="com.StepDefinations",
					plugin= {"pretty", "html:reports/myreport.html",
									"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					dryRun = false,
					monochrome = false,
					publish = true)
public class testRun extends AbstractTestNGCucumberTests{

}
