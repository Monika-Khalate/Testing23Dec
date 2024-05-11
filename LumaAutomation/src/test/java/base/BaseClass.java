package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver openChromeBrowser()
	{
		
		//System.setProperty(Key, path);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
		
		//System.setProperty(null);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openEdgeBrowser()
	{
		
		//System.setProperty(null);
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	

}
