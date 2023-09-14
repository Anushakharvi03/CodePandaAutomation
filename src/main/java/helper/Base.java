package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	//to keep the property file code
	//static blcok executes the code first
	static {
		try {
			FileInputStream file = new FileInputStream("/home/anusha/eclipse-workspace/com.swaglabs/src/test/java/resources/env.properties");
			 prop = new Properties();
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//precondition @Before
	@Before
//	public void user_launch_site_url() {
	public void setUp() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			
		driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			
		driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("edge")) {
			
			driver = new EdgeDriver();
			}
		
		//driver.get("https://www.saucedemo.com/");
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	//postcondition @After
	@After
	public void browserClose(Scenario s) throws IOException // here Scenario is a predefined class, which stored the status of the testcases
	{
		if(s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot)driver ;
			File src = t.getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(src, new File("Screenshots/test.png"));
			FileHandler.copy(src, new File("Screenshots/"+s.getName()+".png")); //.getName takes the name of the testcas scenario from the payment.feature file
			
		}
		driver.quit();
	}
	
	
	//Generic method creation
	public void selectDropdownByText(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(value);
}
	
	
}