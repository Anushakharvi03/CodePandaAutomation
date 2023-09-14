package cucumer.Options;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		//Adding implicit wait method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// switchig to the package list frame
		driver.switchTo().frame("packageListFrame");
		WebElement firstLink = driver.findElement(By.xpath("//ul[@title=\"Packages\"]/li[1]/a"));
		firstLink.click();
		
		//switching from package list to default page
		driver.switchTo().defaultContent();
		
		//switching to the class frame 
		driver.switchTo().frame("classFrame");
		WebElement helpLink = driver.findElement(By.xpath("(//ul[@title=\"Navigation\"])[1]/li[8]/a"));
		helpLink.click();
	}

}
