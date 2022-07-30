package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMForFacebook {


  @FindBy(xpath="//input[@id=\"email\"]") private WebElement EmailID;
  @FindBy(xpath="//input[@id=\"pass\"]") private WebElement Pass;
  @FindBy(xpath="//button[@id=\"loginbutton\"]") private WebElement  Login;


  public POMForFacebook(WebDriver driver){
  PageFactory.initElements(driver,this);
  }

  public void enterEmailID(){
  EmailID.sendKeys("sagarwaje");
  }

  public void enterPass(){
  Pass.sendKeys("sagar@123");
  }

  public void clickOnLogin(){
  Login.click();
  }
}
