package YoutubeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the URL and maximize
		driver.get("https://www.youtube.com/");
		
		//Maximize and Implicit Wait for things to initialize
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Set item name here
		String searchWord = "Kannada Movies";
		
		// Wait 5 seconds for site to get loaded
	    //Thread.sleep(10000);
		
	    //
	    driver.findElement(By.xpath("//input[@id='search']")).clear();
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys(searchWord);
	    //driver.findElement(By.name("search_query")).clear();
	    //driver.findElement(By.name("search_query")).sendKeys(searchWord);
	    

	}

}
