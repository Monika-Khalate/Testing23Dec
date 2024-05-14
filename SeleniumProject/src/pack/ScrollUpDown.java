package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		
		// how to perform scroll down
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,3000)");   // scroll down
		
		js.executeScript("window.scrollBy(0,-3000)");    // scroll up
		
		js.executeScript("window.scrollBy(3000,0)");    //  scroll right
		
		js.executeScript("window.scrollBy(-3000,0)");     // scroll left
		
		// scroll up to target webelement is not displayed
		
		WebElement Sell = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Sell);  //  scroll down
		
		js.executeScript("window.scrollBy(0,-300)");    // scroll up
		Sell.click();
		
	}

}
