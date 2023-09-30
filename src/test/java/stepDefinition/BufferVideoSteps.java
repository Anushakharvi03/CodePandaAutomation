package stepDefinition;

import io.cucumber.java.en.And;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import pageObjects.BufferPage;

public class BufferVideoSteps {
	
	BufferPage b = new BufferPage();
	
	@And("cursor hover on the play button")
	public void cursor_hover_on_the_play_button() {
		b.play_video_file();
	  
	}
	
	

//	@When("cursor hover on the play button")
//	public void cursor_hover_on_the_play_button() {
//		b.play_video_file();
//	  
//	}
//	@Then("click on play button")
//	public void click_on_play_button() {
//		b.play_video_file();
//	    System.out.println("check buffering");
//	}



}
