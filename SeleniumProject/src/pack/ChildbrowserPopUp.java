package pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowserPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
//		// How to handle child browser popup
//		
//		// 1. To get the address of child browser
//		
//		//Return type - String
//		// Get the address of main page
//		driver.getWindowHandle();  // only 1 address
//		
//		//Return type - Set<String> set of string
//		//Get the address of main page & all child browsers
//		driver.getWindowHandles(); // multiple address
//		
//		
//		//2. Switch the selenium focus from main page to child browser
//		driver.switchTo().window("String address of child browser");

		WebElement alert =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		Thread.sleep(1000);
		WebElement confirm =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		Thread.sleep(1000);
		WebElement prompt =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		Thread.sleep(1000);
		WebElement line =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		confirm.click();
		prompt.click();
		line.click();
		
		String mainpage = driver.getWindowHandle(); // only 1 address
		System.out.println(mainpage);
		
		// To get the data based on index
		List<String> list =new ArrayList<String>(driver.getWindowHandles());
		
		String a0=list.get(0);
		System.out.println(a0);
		
		String a1=list.get(1);
		System.out.println(a1);
		
		String a2=list.get(2);
		System.out.println(a2);
		
		String a3=list.get(3);
		System.out.println(a3);
		
		String a4=list.get(4);
		System.out.println(a4);
		
		driver.switchTo().window(a0);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(a1);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(a2);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(a3);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(a4);
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	
		
	}

}
