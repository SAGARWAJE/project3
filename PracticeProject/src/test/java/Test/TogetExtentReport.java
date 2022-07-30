package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utility.ExtReport;

public class TogetExtentReport extends BaseClass{

	
	ExtentReports reportss;
	ExtentTest test;
	
	   @BeforeTest
	   public void extentReports() {
		   reportss = ExtReport.generateReport(); 
	   }
	
	   @BeforeMethod
	   public void browser() {
		   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/login/");
		   driver.manage().window().maximize();
	   }
		
	   @Test
	   public void facebooklogin() {
		   test = reportss.createTest("facebooklogin");
		   
		   WebElement emails = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		   emails.sendKeys("sagarwaje");
	   
	   
	  
		   WebElement pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		   pass.sendKeys("saggy");
	   
	   
	   
		   WebElement login = driver.findElement(By.xpath("//button[@id\"loginbutton\"]"));
		   login.click();
		   
	   }
	   
	   @AfterMethod
	   public void closeBrowser(ITestResult result) {
		   if(result.getStatus() == ITestResult.FAILURE) {
			   test.log(Status.FAIL, result.getName());
		   }else if (result.getStatus() == ITestResult.SUCCESS){
			   test.log(Status.PASS, result.getName());	   
		   }else {
			   test.log(Status.SKIP, result.getName());
		   }
	   }
	   
	   @AfterTest
	   public void flushResult() {
		   reportss.flush();
	   }
}
