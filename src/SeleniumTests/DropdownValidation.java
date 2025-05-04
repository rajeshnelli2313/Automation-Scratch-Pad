package SeleniumTests;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		
		WebElement brandDropdown = driver.findElement(By.id("course"));
		Select dropdown = new Select(brandDropdown);
		List<WebElement> val = dropdown.getOptions();
		
		List<String> actuals = new ArrayList<>();
		
		for (WebElement item : val)
		{
			actuals.add(item.getText());
		}
		
		// Expected values list
		List<String> expectedValues = List.of("Select", "Java", "Dot Net", "Python", "Javascript");
		if (actuals.equals(expectedValues))
		{
			System.out.println("All Values are matching");
		}
		else
		{
			System.out.println("The valiues are not matching");
		}
		
		
		
		
		
		

	}

}
