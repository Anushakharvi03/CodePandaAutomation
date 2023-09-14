package cucumer.Options;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Adding implicit wait method
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
