package Opencart.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/DemoOpencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_register"},
		glue = {"Opencart.stepdefinition"},  
		monochrome = true//readable
		)

public class Registrationrunner {
	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.141.59");
		Reporter.setSystemInfo("Maven", "4.0.0");
		Reporter.setSystemInfo("Java Version", "1.8.0_131");

}
}
