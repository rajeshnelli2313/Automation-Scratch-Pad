package SeleniumTests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenCart {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		int j=0;
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Potato", "Pumpkin", "Mushroom", "Onion", "Pears", "Strawberry"};
		List<String> al = Arrays.asList(itemsNeeded);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();			
			
			{
				
				if (al.contains(formattedName))
				{
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
					if(j == itemsNeeded.length)
					{
						break;
					}
				}
			}
		
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
		WebElement StaticDropdown = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByVisibleText("India");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
		
		
		
		
		
		
		
		
		

	}

}
