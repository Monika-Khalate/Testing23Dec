package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(3000);
		
	WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
	id.sendKeys("12345");
	
	WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));	
	submit.click();
	
	Thread.sleep(3000);
	
	// How to handle the alert popup
	
	//1. switch selenium focus from main page to alert popup
	Alert alt = driver.switchTo().alert();
	
	// 2. using following methods we can perform action on alert popup
	
	String text = alt.getText();
	System.out.println(text);
	
	// 1st alert popup
	alt.accept();
	
	Thread.sleep(3000);
	
	// 2nd alert popup
	alt.accept();
	

	
		
	}

}
