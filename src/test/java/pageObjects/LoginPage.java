package pageObjects;
import java.time.Duration;

import helper.Base;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;


//inheritance here LoginPage is a child class and base class is a parent class
public class LoginPage extends Base{
	
	//WebDriver driver;
	
	
	//Page object model reduces the code
	//creating method 
	public void user_Login_Application() {
		
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		userName.sendKeys(prop.getProperty("username"));

		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys(prop.getProperty("password"));
		
		WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));
		loginBtn.click();
		
		WebElement country = driver.findElement(By.xpath(null));
		WebElement state = driver.findElement(By.xpath(null));
		
		selectDropdownByText(country,"India");
		selectDropdownByText(state,"karnataka");
	    
	}
	
	
	
	public boolean validate_successfull_login() {
		return driver.findElement(By.xpath("//span[@class=\"title\"]")).isDisplayed();
		
	}
	

}
