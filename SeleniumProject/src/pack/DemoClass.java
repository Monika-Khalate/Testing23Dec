package pack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		
		// how to change size of browser
		
				Dimension d= new Dimension(300, 700);
				driver.manage().window().setSize(d);
				
	// how to get size of current browser
				Dimension d1=driver.manage().window().getSize();
				System.out.println(d1.height);
				System.out.println(d1.width);
			
				Thread.sleep(5000);
				// how to change position of browser
				Point p= new Point(200, 400);
			driver.manage().window().setPosition(p);
			
			
	// how to get position of current browseer
			
			 Point p1= driver.manage().window().getPosition();
			 System.out.println(p1.x);
			 System.out.println(p1.y);
			 
			 
	}

}
