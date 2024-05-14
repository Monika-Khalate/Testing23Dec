package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MockProgram {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
WebElement all = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
         all.click();
		
	
		Select s = new Select(all);
		s.selectByValue("search-alias=stripbooks");
	}

}
