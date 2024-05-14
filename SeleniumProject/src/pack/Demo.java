package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Facebook.com");
		Thread.sleep(5000);

		// how to maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// how to minimize the brower
//		driver.manage().window().minimize();
		
		
		WebElement account = driver.findElement(By.xpath("//a[text()='Create new account']"));  
		account.click();
		
		Thread.sleep(3000);
		
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement pronoum= driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		
		// To verify the checkbox or radio button is selected or not
		// Return type - boolean
		
		boolean result =custom.isSelected();
		System.out.println(result);
		
		
//		if(result==true)
//		{
//			System.out.println("Radio button is selected");
//		}
//		else
//		{
//			custom.click();
//			System.out.println("Radio button is not selected");
//		}
//		
//		result = custom.isSelected();
//		System.out.println(result);
		
		//-------------------------------------------------------------------------
		
		System.out.println("----------------------------------------");
		
		
	// To verify if element is hidden or not
		
		
//     result = pronoum.isDisplayed();
//     System.out.println(result);
//     
//     if(result==true)
//     {
//    	 System.out.println("Element is displayed");
//     }
//      
//     else
//    	 
//     {
//    	 System.out.println("Element is hide");
//    	 custom.click();
//     }
//		
//     result = pronoum.isDisplayed();
//     System.out.println(result);	
		
		
		
		
		
	}

}
