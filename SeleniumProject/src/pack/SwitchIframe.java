package pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchIframe {
	
	
public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert.click();
		
		// child browser
		
		List<String> list =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		// how to handle the iframe
	

		driver.switchTo().frame("iframeResult"); // id or name attribute value
		
        WebElement 	tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryit.click();
        
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        // switch from iframe to its immediate iframe
        driver.switchTo().parentFrame();
        
        // switch from iframe to main page directly
      //  driver.switchTo().defaultContent();
        
        
   WebElement getyourwebsite = driver.findElement(By.xpath("//a[@id='getwebsitebtn']")) ;
   getyourwebsite.click();
		
		
   List<String> list1 =new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(list1.get(2));
   
   WebElement getstart = driver.findElement(By.xpath("(//a[text()='Get Started for Free'])[1]")) ;
   getstart.click();
}


}