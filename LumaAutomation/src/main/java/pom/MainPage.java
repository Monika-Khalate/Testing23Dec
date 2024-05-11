package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	// variables

	@FindBy(xpath=("//input[@id='search']"))
	private WebElement searchentirestorehere	;


    @FindBy(xpath=("//a[@id=\"ui-id-3\"]"))
	private WebElement whatsnew	;
	
	
	@FindBy(xpath=("//span[text()='Women']"))
	private WebElement women	;
	
	
	@FindBy(xpath=("//span[text()='Men']"))
	private WebElement men	;
	
	
	@FindBy(xpath=("//span[text()='Gear']"))
	private WebElement gear	;
			
	
	@FindBy(xpath=("//span[text()='Training']"))
	private WebElement training	;
	
	
	@FindBy(xpath=("//span[text()='Sale']"))
	private WebElement sale 	;
	
	
	@FindBy(xpath=("(//li[@class='authorization-link'])[1]"))
	private WebElement signin	;

	
	@FindBy(xpath=("(//a[text()='Create an Account'])[1]"))
	private WebElement createanaccount	;
	
	//constructor
	public MainPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
		
	}
	
	
	
	// methods
	
		public void SearchEntireStoreHere()
		{
			searchentirestorehere.sendKeys("children");
		}
		
		public void WhatsNew()
		{
			whatsnew.click();

		}
		
		public void  Women()
		{
			 women.click();

		}
		
		public void Men()
		{
			men.click();

		}
		
		public void Gear()
		{
			gear.click();

		}
		
		
		public void Training()
		{
			training.click();

		}
		
	
		public void  Sale()
		{
			 sale.click();

		}
		
		public void SignIn()
		{
			signin.click();

		}

			public void CreateAnAccount()
			
		{
		createanaccount.click();

		}
	
}
