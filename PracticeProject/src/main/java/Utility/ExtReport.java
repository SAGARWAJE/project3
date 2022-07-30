package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtReport {
 
	public  static ExtentReports generateReport() {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("Regression","Facebook");
	    report.setSystemInfo("Browser","Chrome");
	    return report;
	}
}
