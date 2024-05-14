package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		Thread.sleep(5000);
		
		// how to get current url in browser
		String  url = driver.getCurrentUrl();
		System.out.println(url);
		
		
	    // how to get title of current page
		String title= driver.getTitle();
		System.out.println(title);
		
	System.out.println("------------------------------------------");	
	
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement newacc = driver.findElement(By.xpath("//a[contains(text(),'new account')]"));
		
		
		// To get html text present on webelement
		String text= newacc.getText();
		
		System.out.println(text);
		
		if (text.equals("Create new account"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
		}
		
		
		System.out.println("--------------------------------------------");
	
		// to get attribute value
		
		String attributevalue =username.getAttribute("aria-label");
		System.out.println(attributevalue);
		
		
		if(attributevalue.equals("Email address or phone number"))
		{
			System.out.println("PASS");
		}
		
		
		else
		{
			System.out.println("FAILED");
		}
		
		
		// to click on submit button in case of application form
		// Alternative for click method
		
		username.submit();
	}

}
