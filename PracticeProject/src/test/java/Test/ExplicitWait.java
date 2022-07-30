package Test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500000));
//        WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='sgar']"))));
//        element.click();
//        
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofMillis(500000));
        WebElement elements = waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='sgar']"))));
        elements.click();
		
     
        
		
		
}
}
