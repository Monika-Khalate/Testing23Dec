package pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeChildOfChild {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		System.out.println(driver.getCurrentUrl());
		
		WebElement alert =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert.click();
		
		// child browser
		
		List<String> list =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
		WebElement getyourownwebsite = driver.findElement(By.xpath("//a[text()='Get your']"));
		getyourownwebsite.click();
		
		// child of child browser
		List<String> list1 =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getCurrentUrl());
	}

}
