package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	//	driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		WebElement accandlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement yourorder = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		
		// How to perform mouse actions 
		Actions act = new Actions(driver);
		
		act.moveToElement(accandlist).moveToElement(yourorder).click().build().perform();
		
		
//		act.click();                                                 // left single click
//		act.doubleClick();                                          //  left double click
//		act.contextClick();                                         // right click
//		act.moveToElement(yourorder) ;                      // move mouse focus to target webelement
//		act.dragAndDrop(accandlist, yourorder);            // drag the source element & drop on target webelement
//		act.clickAndHold(yourorder);                  // click the source element & hold the focus(hold th button)
//		act.release();                                // release the focus
//		
//		act.build();                                  // to combine multiple mouse action in single line
//		act.perform();                                // to execute mouse actions on the browser
		
	}

}
