package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");  // Open any url
		System.out.println(driver.getTitle());  //Print the title of the page on the console
		System.out.println(driver.getCurrentUrl());  //Print the current url on the console
		driver.findElement(By.name("search_query")).sendKeys("Test");
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(2000);
		//driver.findElement(By.className("yt-icon-shape")).click();
		driver.close();  //Closing the browser 
		driver.quit();  //Closes all the instance of the browsers
		
		

	}

}
