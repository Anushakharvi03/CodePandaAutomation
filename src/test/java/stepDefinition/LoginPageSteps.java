package stepDefinition;


//import java.time.Duration;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Base;
//import org.openqa.selenium.chrome.ChromeOptions;
//
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

//public class LoginPageSteps extends Base{
public class LoginPageSteps { //no need to extend the Base class because we using @before instead of setup method
	//WebDriver driver;  
	//creating the object of LoginPage.java from pageObjects package
		LoginPage login = new LoginPage();
	
//	@Given("user launch site url")
//	public void user_launch_site_url() {
		//login.user_launch_site_url();
//		setUp();
		
//		//System.out.println("Launch URL");
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		driver.manage().window().maximize();
		
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--incognito");
		//WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
//	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		//object.method name
		login.user_Login_Application();
		
		//System.out.println("Enter details");
		//WebElement userName = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		//userName.sendKeys("standard_user");


		//WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		//password.sendKeys("secret_sauce");

	    
	}

//	@When("user click on button")
//	public void user_click_on_button() {
//		//System.out.println("click button");
//		WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));
////		WebElement loginBtn = driver.findElement(By.xpath("//input[@id=’login-button’]"));
//				loginBtn.click();

	    
//	}

	@Then("validate successfull login")
	public void validate_successfull_login() {
//		System.out.println("success login");
		assertTrue(login.validate_successfull_login()); 
		//assertTrue(driver.findElement(By.xpath("//span[@class=\"title\"]")).isDisplayed());
		
	}

	//@Then("validate success message")
	//public void validate_success_message() {
	//	System.out.println("success");
	    
	//}

	//@Then("validate error login")
	//public void validate_error_login() {
	//	System.out.println("Error");
	//}




}
