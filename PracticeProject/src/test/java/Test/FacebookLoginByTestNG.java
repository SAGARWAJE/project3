package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.POMForFacebook;



public class FacebookLoginByTestNG  {

    WebDriver driver;
    
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void m2() {
		POMForFacebook test1= new POMForFacebook(driver) ;
		test1.enterEmailID();
	}
	
	@Test
	public void m3() {
		POMForFacebook test2= new POMForFacebook(driver) ;
		test2.enterPass();
	}
	
	@Test
	public void m4() {
		POMForFacebook test3= new POMForFacebook(driver) ;
		test3.clickOnLogin();
	}
	
	@Test
	public void git3() {
		System.out.println("added new method for git 3");
	}
	
	@Test
	public void git4() {
		System.out.println("added new method for git 4");
	}
}
