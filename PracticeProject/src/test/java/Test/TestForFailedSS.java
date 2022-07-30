package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersAll.class)

public class TestForFailedSS extends BaseClass {

	@Test
	public static void login() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String name = driver.getTitle();
		Assert.assertEquals("facebook1", name);
		
	}
}
