package cucumer.Options;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
	public static void main (String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		WebElement btnl = driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]"));
		btnl.click();
		
		Set<String>allWindow = driver.getWindowHandles();
		for(String s: allWindow) {
			if(!parentId.equals(s))
			{
				driver.switchTo().window(s);
				WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));
				firstName.sendKeys("Test");
				
				driver.close();
				}
		}
		
		//switch focus to the parent page
		driver.switchTo().window(parentId);
		WebElement Name = driver.findElement(By.cssSelector("input#name"));
		Name.sendKeys("helloo");
		
	
	}

}
