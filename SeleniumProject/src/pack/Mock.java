package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		
	WebElement name =driver.findElement(By.xpath("//input[@type='text']"));
	name.sendKeys("velocity@1234");
	
	
	WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("vnbSDhcvbhvfgc");
	
	Thread.sleep(3000);
	name.clear();
	Thread.sleep(3000);
	name.sendKeys("Testing");
		
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));  
	login.click();
	
	WebElement link = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten pass')]"));
	link.click();
	
	
	
	
	
	}

}
