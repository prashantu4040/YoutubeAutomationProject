package YoutubeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL and maximize
		driver.get("https://www.youtube.com/");

		// Maximize and Implicit Wait for things to initialize
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Set item name here
		String searchWord = "Movies";

		// Wait 5 seconds for site to get loaded
		Thread.sleep(5000);

		// Find the element where Search Word is to be entered,
		// populate the search bar
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(searchWord);
		// driver.findElement(By.name("search_query")).clear();
		// driver.findElement(By.name("search_query")).sendKeys(searchWord);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();

		// Wait 5 seconds for site to get loaded
		Thread.sleep(5000);

		// Get movie name and print it in console
		// driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).getText();
		String movieOne = driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).getText();
		String movieTwo = driver.findElement(By.xpath("(//a[@id='video-title'])[2]")).getText();
		String movieThree = driver.findElement(By.xpath("(//a[@id='video-title'])[2]")).getText();
		System.out.println("Movie 1: " + movieOne);
		System.out.println("Movie 2: " + movieTwo);
		System.out.println("Movie 3: " + movieThree);
		
		// Wait 5 seconds
	    Thread.sleep(5000);

	    //Close and quit the driver
	    driver.close();
	    driver.quit();
	}

}
