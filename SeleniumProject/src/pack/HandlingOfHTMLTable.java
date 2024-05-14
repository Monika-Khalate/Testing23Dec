package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOfHTMLTable {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();   // 01
	
	driver.manage().window().maximize();
	
//	driver.get("https://www.amazon.in/");	
//	
//		
//	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));	
//		
//	int noofwebelement = alllinks.size();      // number of data stored in collection
//	System.out.println(noofwebelement);
//	
//	for(int i=0; i<20; i++)
//	{
//	   WebElement ele = alllinks.get(i)	;
//	   String link = ele.getAttribute("href");
//	   System.out.println(link);
		
		
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	// how to handle HTML table
	//using relative xpath for matching all cells using findelements method
	
	List<WebElement>cells = driver.findElements(By.xpath("//table[@id='customers']//td"));
	
	int noofcells = cells.size();  // number of data stored in collection
	System.out.println(noofcells);
	
	for(int i = 0; i<noofcells; i++)
	{
		WebElement cell = cells.get(i);
		String text = cell.getText();
		System.out.println(text);
	}
	
	
	}
		
		
	}


