package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.BaseBuffer;

public class BufferPage extends BaseBuffer{
public void play_video_file() {
	WebElement playButton = driver.findElement(By.xpath("/html/body"));
	playButton.click();
		
//	WebElement videoHover = driver.findElement(By.xpath("//button[@class=\"Button_module_button__f5fb72bd shared_module_focusable__63d26f6d Button_module_customColor__f5fb72bd Button_module_md__f5fb72bd Button_module_icon__f5fb72bd Tooltip_module_tooltipContainer__21ae5b80 exclude-global-button-styles PlayButton_module_playButton__fc6bec57 shared_module_focusable__63d26f6d\"]"));
//	
//	Actions a = new Actions(driver);
//	a.moveToElement(videoHover).build().perform();
//
//	WebElement playButton = driver.findElement(By.xpath("//button[@aria-label=\"Play\"]"));
//	playButton.click();
	
//	WebElement videoHover = driver.findElement(By.xpath("/html/body"));
//
//	Actions a = new Actions(driver);
//	a.moveToElement(videoHover).build().perform();

//	WebElement playButton = driver.findElement(By.xpath("//body"));
	
		
	    
	}




}
