package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(3000);
			
	//	driver.close() ; // to close the current tab in browser
		
	//	driver.quit();   // to close all tabs in browser
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		
//		System.out.println("start");
//		username.sendKeys("Velocity");
//		
//		Thread.sleep(3000);
//		
//		// clear the text present on webelement 
//		   username.clear();//
//		   
//		   Thread.sleep(10000);
//		   
//		   
//		username.sendKeys("Testing");
		
		
		
			// To verify that element is enable or disable
		
		boolean result = login.isEnabled();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Login button is enabled");
		}
		else
		{
			System.out.println("Login button is not enabled");
			username.sendKeys("Velocity");
			password.sendKeys("123456789");
		}
		
		result = login.isEnabled();
		System.out.println(result);

		
		
		
		
		
		
	}
	
}