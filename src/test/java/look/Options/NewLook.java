package look.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewLook {
	public static void main (String[] args)
	{
	NewLook N = new NewLook();
	N.registrationPage();
	}
	public void registrationPage()
	{
		//browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.newlook.com/row/register");
		driver.manage().window().maximize(); // maximize the screen
		
		WebElement emailAddress = driver.findElement(By.cssSelector("input#email")); //fiding element path
		emailAddress.sendKeys("testanu@gmail.com"); //
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"pwd\"]"));
		password.sendKeys("User@123456");
		
		WebElement title = driver.findElement(By.cssSelector("select#titleCode"));
		Select s = new Select(title);
		s.selectByVisibleText("Ms.");
		//s.selectByVisibleText("Mrs");
		//s.selectByIndex(1);
		//s.selectByValue("mrs");
		
		WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));
		firstName.sendKeys("anusha");
		
		WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));
		lastName.sendKeys("kharvi");
		WebElement checkBox = driver.findElement(By.cssSelector("label.label.checkbox__label"));
		checkBox.click();
		
		WebElement createBtn = driver.findElement(By.xpath("//button[@data-ng-click=\"onSubmit($event)\"]"));
		createBtn.click();
	
	}


}
