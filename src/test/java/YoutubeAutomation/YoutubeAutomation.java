package YoutubeAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the URL and maximize
		driver.get("https://www.youtube.com/");
		
		//Set item name here
		String searchWord = "Movies";
		
		// Wait 5 seconds for site to get loaded
	    Thread.sleep(5000);
		

	}

}
