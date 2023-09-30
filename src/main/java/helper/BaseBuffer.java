package helper;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;


public class BaseBuffer {
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		try {
			FileInputStream file = new FileInputStream("/home/anusha/eclipse-workspace/com.swaglabs/src/test/java/resources/env1.properties");
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

	@Before
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
		
	
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
	}
	
//	@After
//	public void browserClose(Scenario s) throws IOException // here Scenario is a predefined class, which stored the status of the testcases
//	{
//		if(s.isFailed()) {
//			
//			TakesScreenshot t = (TakesScreenshot)driver ;
//			File src = t.getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(src, new File("Screenshots/"+s.getName()+".png")); //.getName takes the name of the testcas scenario from the payment.feature file
//			
//		}
//		driver.quit();
//	}
	

}
