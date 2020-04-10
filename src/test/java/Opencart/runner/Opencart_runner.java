package Opencart.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/feature/DemoOpencart.feature",
					plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
			"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
					
		tags = {"@tc01_register,@tc2_login,@tc03_search,@tc04_Special,@tc05_selectproduct,@tc06_forgotpass,@tc07_currency"},
			glue = {"Opencart.stepdefinition"},
			monochrome = true
			
			)

	public class Opencart_runner {
		 @AfterClass
	     public static void extendReport()
	   {
	       Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
	       Reporter.setSystemInfo("user", System.getProperty("user.name"));
	       Reporter.setSystemInfo("os", "Windows");
	       Reporter.setTestRunnerOutput("Sample test runner output message");
	   }
	}

