package pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert.click();
		
		// child browser
		
		List<String> list =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		// how to handle the iframe
	
//		driver.switchTo().frame(1); // 1 or 2
//		driver.switchTo().frame("iframeResult"); // id or name attribute value
		
		WebElement framelocator = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(framelocator);
		
		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		
		
		
	}

}
