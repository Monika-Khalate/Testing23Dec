package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
           Thread.sleep(3000);
		
		driver.manage().window().maximize();   
		
		WebElement name =driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("velocity@1234");
		
		
		WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("vnbSDhcvbhvfgc");
		
		
		WebElement newacc =driver.findElement(By.xpath("//a[text()='Create new account']"));
		newacc.click();
		
		Thread.sleep(3000);
		
		// How to handle drop-down /list box/ select box
		
		
		// 1. Find the webelement
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		// 2.create object of select class & pass web element base argument
		
		Select s = new Select(month);
		
		// 3. select value using below methods of select class
		
		s.selectByIndex(0);  // basis- tagname -> index of tagname index = 0, 1,2,3......
	//	s.selectByValue("10"); //basis- attribute-> value of attribute should be pass as argument
	//	s.selectByVisibleText("Sep"); // basis - html text-> Text visible on UI
		
		
	}

}
