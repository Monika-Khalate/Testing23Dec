package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {
	


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000); // Delay- it will stop execution for 3 sec
		
		driver.navigate().to("https://www.google.com");  // to launch application
		Thread.sleep(3000);
		
		driver.navigate().back();    // click on back button
//		Thread.sleep(3000);
		
//		driver.navigate().forward();  // click on forward button
//		Thread.sleep(3000);
//		driver.navigate().refresh();   // click on refresh button
		
	}

}
