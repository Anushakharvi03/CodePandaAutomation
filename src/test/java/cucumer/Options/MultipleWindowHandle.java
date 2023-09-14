package cucumer.Options;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {
	public static void main (String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//Adding implicit wait method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String parentId = driver.getWindowHandle(); //current window
		WebElement btnl = driver.findElement(By.xpath("//button[@id=\"newTabBtn\"]"));
		btnl.click();
		
		Set<String>allWindow = driver.getWindowHandles(); //this code is for all open window --parentID+childID
		
		for(String s: allWindow) {
			if(!parentId.equals(s))
			{
				driver.switchTo().window(s);
				
				String title = driver.getTitle();
				if(title.equals("AlertsDemo - H Y R Tutorials")) {
					
					WebElement clickMeBtn = driver.findElement(By.cssSelector("button#alertBox"));
					clickMeBtn.click();
					Alert a = driver.switchTo().alert();
					a.accept();
					break;
						
				}
					
				}
				
				}
		}
	}
		