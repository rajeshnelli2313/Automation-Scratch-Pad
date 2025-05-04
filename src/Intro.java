import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");  // Open any url
		System.out.println(driver.getTitle());  //Print the title of the page on the console
		System.out.println(driver.getCurrentUrl());  //Print the current url on the console
		driver.close();  //Closing the browser 
		driver.quit();  //Closes all the instance of the browsers
		
		

	}

}
