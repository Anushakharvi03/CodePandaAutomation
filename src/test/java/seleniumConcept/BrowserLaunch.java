package seleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
		BrowserLaunch b = new BrowserLaunch();
		b.initialization();
		

	}

	public void initialization() {
		WebDriverManager.chromedriver().setup(); // browser version and 
		WebDriver driver = new ChromeDriver();// chrome browser launch
	}

}
