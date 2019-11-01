package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {

 WebDriver driver;
	
 @Given("Open firefox and start application")
 public void Open_firefox_and_start_application() throws Throwable {
     
	 System.setProperty("webdriver.gecko.driver","./Browserfolder/geckodriver.exe");
	 driver= new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com");
 }

 @When("Enter valid username and valid password")
 public void Enter_valid_username_and_valid_password() throws Throwable{
     driver.findElement(By.id("email")).sendKeys("habib85@gmail.com");
     driver.findElement(By.id("pass")).sendKeys("Nana123");
 }

 @Then("User should be able to login successfully")
 public void User_should_be_able_to_login_successfully() throws Throwable{
    driver.findElement(By.id("loginbutton")).click();
 }


}
