package cucumer.Options;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bufferTest {
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://videos.godaddy.com/detail/videos/top-videos/video/6160431996001/video-editing-basics?autoStart=true");
		driver.get("https://vimeo.com/826105342/d82f3b6b86?share=copy");

		//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//WebElement videoHover = driver.findElement(By.xpath("//video[@data-video-id=\"6160431996001\"]"));
		WebElement videoHover = driver.findElement(By.xpath("//button[@class=\"Button_module_button__f5fb72bd shared_module_focusable__63d26f6d Button_module_customColor__f5fb72bd Button_module_md__f5fb72bd Button_module_icon__f5fb72bd Tooltip_module_tooltipContainer__21ae5b80 exclude-global-button-styles PlayButton_module_playButton__fc6bec57 shared_module_focusable__63d26f6d\"]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(videoHover).build().perform();
		
		//WebElement playButton = driver.findElement(By.xpath("//div[@class="vjs-control-bar"]/button[1]/span[2]"));
		WebElement playButton = driver.findElement(By.xpath("//button[@aria-label=\"Play\"]"));
		playButton.click();
		

}
}