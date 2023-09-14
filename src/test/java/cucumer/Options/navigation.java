package cucumer.Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	public static void main (String[] args)
	{
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	//driver.manage().window().maximize();
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	}

}
