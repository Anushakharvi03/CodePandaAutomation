package cucumer.Options;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertPopup {
	public static void main (String[] args) {
		
		//alternative to handle the browser compatibility or version issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		//WebElement alertBtnl = driver.findElement(By.xpath("//button[@id=\"alertBox\"]"));
		//alertBtnl.click();
		
		//Alert a = driver.switchTo().alert();
		//a.accept();
		
		//WebElement clickmeBtnl = driver.findElement(By.xpath("//button[@id=\"confirmBox\"]"));
		//clickmeBtnl.click();
		
		//Alert a = driver.switchTo().alert();
		//a.dismiss();
		
		WebElement clickBtnl = driver.findElement(By.xpath("//button[@id=\"promptBox\"]"));
		//clickBtnl.click();
		
		//Javascript exicutor click for click function
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",clickBtnl);
		js.executeScript("arguments[0].click();",clickBtnl);
		
		//Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println(s);

		a.sendKeys("Hello");
		a.accept();
		
}
}
