package cucumer.Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabBrowser {
public static void main (String[] args)
{
	SwagLabBrowser L = new SwagLabBrowser();
	L.browserSetup();
}
public void browserSetup()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();

	
}
}