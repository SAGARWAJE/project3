package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.POMForFacebook;

public class TestfacebookLoginPageUsingJAVA {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
	
		POMForFacebook test= new POMForFacebook(driver) ;
			test.enterEmailID();
			test.enterPass();
			test.clickOnLogin();
			
		}
	}

