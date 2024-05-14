package pack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		// how to capture the screenshot in selenium
		
		// visible area of the application in the browser
		
		
//		for(int i=0; i<5; i++)
//		{
//		
//		TakesScreenshot t = (TakesScreenshot)driver;  // up casting
//		                                              // here driver=new ChromeDriver
//		
//		
//		File source= t.getScreenshotAs(OutputType.FILE);
//		
//		File dest= new File("C:\\Users\\Dell\\Documents\\Zoom\\Automation\\Screenshots\\Test"+i+".png");
//		
//		FileHandler.copy(source, dest);
//		
//		}
		
// how to get system date & time
		
		String cd = new SimpleDateFormat("dd.mm.yyyy.hh.mm.ss").format(Calendar.getInstance().getTime());
		
		TakesScreenshot t = (TakesScreenshot)driver;  // up casting
                                                      // here driver=new ChromeDriver


         File source= t.getScreenshotAs(OutputType.FILE);

         File dest= new File("C:\\Users\\Dell\\Documents\\Zoom\\Automation\\Screenshots\\Test"+cd+".png");

         FileHandler.copy(source, dest);
		
		
	}

}
