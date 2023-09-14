package cucumer.Options;
import org.openqa.selenium.Keys;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v112.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class sample {
public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  
		//driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=583610945979&utm_campaign=Search-Brand-India&utm_campaigncode=BrowserStack.com+9147869&utm_term=p+browserstack%20com&gclid=Cj0KCQjw5f2lBhCkARIsAHeTvlivDvZLzAbn5OUAKKZlJeInUMg6_CQbUuEHXFs6JT9jTPjZYqmBMV8aAoDfEALw_wcB");
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		//Adding implicit wait method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		
		//hover on product
		WebElement productHover = driver.findElement(By.xpath("//button[@id=\"products-dd-toggle\"]"));
		//WebElement productHover = driver.findElement(By.cssSelector("[data-target='product-menu-dropdown']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(productHover).build().perform();
		
		//click on live
		WebElement liveMenu = driver.findElement(By.xpath("//a[@data-product='Live']"));
		liveMenu.click();
		
		WebElement searchIcon = driver.findElement(By.xpath("//button[@aria-label=\"Search\"]"));
		searchIcon.click();
		
		WebElement searchField = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		searchField.sendKeys("test");
		a.sendKeys(Keys.ENTER).build().perform();
		
}

}
