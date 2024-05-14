package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginOrSignUpPage {
	
	//variable - private => WebElement
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement userName ; 
	
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement password ; 
	
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement loginButton ; 
	
	@FindBy(xpath = ("//a[text()='Forgotten password?']"))
	private WebElement forgotPasswordLink ; 
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement createNewAccButton ; 
	
	
	
	
	//constructor - public => WebElement Initialization
	
	public FbLoginOrSignUpPage(WebDriver driver_1)     // driver_1 => driver=new chromedriver 
	                                              // so, we can inspect all webelement of pom class in browser by using test class webdriver
	{
		
	//initelements => find all webelement based on @findby annotation
    //1. check @findby annotation
	//2. get location from @findby annotation & find webelement
	//3. store webelement in respective variable
	//4. check next @findby annotation	
		
		
		PageFactory.initElements(driver_1, this); // this => represent object of current class
		                                        // so, 'this' keyword is used to represent all webelement in this class
		
	}
	
	
	
	
	
	//method - public => Action on WebElement
	
	// for single actions
	public void sendUserName(String userId)
	{
		userName.sendKeys(userId);
	}
	
	public void sendPassword(String userPassword)
	{
		password.sendKeys(userPassword);
	}

	public void clickOnLoginButton()
	{
		
		loginButton.click();
	}
	
	public void clickOnCreateNewAccButton()
	{
	
		createNewAccButton.click();
	}
	
	public void clickOnForgotPasswordButton()
	{
	
		forgotPasswordLink.click();
	}
	
	// for group of actions
	public void login(String userId, String userPassword)
	{
		
	userName.sendKeys("velocity@gmail.com");	
	password.sendKeys("123456");
	loginButton.click();	
		
	}
	
		
}
