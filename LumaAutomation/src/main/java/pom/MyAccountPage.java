package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {
	
	//variables
	
	
			
			
@FindBy(xpath=("(//li[@class='authorization-link'])[1]"))
	private WebElement signin	;


@FindBy(xpath=("(//input[@id='customer-email'])[1]"))
private WebElement email	;


@FindBy(xpath=("//input[@name='login[password]']"))
private WebElement password	;


@FindBy(xpath=("(//button[@type='submit'])[2]"))
private WebElement submit	;

@FindBy(xpath="(//li[@class='customer-welcome'])[1]")
private WebElement welcome ;

@FindBy(xpath="(//a[text()='My Account'])[1]")
private WebElement myaccount ;


@FindBy(xpath="//span[text()='Manage Addresses']")
private WebElement manageaddress ;

@FindBy(xpath="(//input[@type='text'])[5]")
private WebElement phonenumber ;


@FindBy(xpath="//input[@id='street_1']")
private WebElement streetaddress ;

@FindBy(xpath="//input[@id='city']")
private WebElement city ;

@FindBy(xpath="//select[@id='region_id']")
private WebElement state ;



@FindBy(xpath="//input[@id='zip']")
private WebElement zipcode ;


@FindBy(xpath="//span[text()='Save Address']")
private WebElement saveaddress ;

@FindBy(xpath="//button[@role='add-address']")
private WebElement addnewaddress ;



private JavascriptExecutor js;
private WebDriver driver;
//constructor
	public MyAccountPage(WebDriver driver)
	{
       this.driver=driver;
       js=(JavascriptExecutor)driver;
       
		PageFactory.initElements(driver, this);
			
	}
	
	// methods
	
	public void SignIn()
	{
		signin.click();

	}
	
	public void Email(String mailid)
	{
		email.sendKeys(mailid);

	}
	
	public void Password(String pass)
	{
		password.sendKeys(pass);

	}
	
	public void Submit()
	{
		submit.click();

	}
	
	public void WelcomeMessage()
	{
		welcome.click();

	}
	
	public void MyAccountOpen()
	{
		myaccount.click();

	}
	
	public void ManageAddress()
	{
		manageaddress.click();

	}

	public void PhoneNumber(String num) throws InterruptedException
	{
		Thread.sleep(3000);
		phonenumber.sendKeys(num);
	}

	public void StreetAddress(String address)
	{
		streetaddress.sendKeys(address);
	}
	
	public void City(String cityname)
	{
		city.sendKeys(cityname);
	}

	public void State()
	{
		Select s = new Select(state);
		s.selectByValue("24");
	}
	
	public void ZipCode(String code)
	{
		zipcode.sendKeys(code);
	}
	
	public void SaveAddress()
	{
		saveaddress.submit();

	}
	
	public void AddNewAddress()
	{
		
		js.executeScript("arguments[0].scrollintoView(true)", addnewaddress);
		addnewaddress.click();

	}


}
