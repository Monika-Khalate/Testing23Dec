package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	//variables
	
	@FindBy(xpath=("(//li[@class='authorization-link'])[1]"))
		private WebElement signin	;
	
	
	@FindBy(xpath=("//input[@name='login[username]']"))
	private WebElement email	;
	
	
	@FindBy(xpath=("//input[@name='login[password]']"))
	private WebElement password	;
	
	
	@FindBy(xpath=("(//button[@type='submit'])[2]"))
	private WebElement submit	;
	
	
	@FindBy(xpath=("(//span[text()='Forgot Your Password?'])[1]"))
	private WebElement forgotpassword	;
			
	
	@FindBy(xpath=("(//span[text()='Create an Account'])[1]"))
	private WebElement createnewaccount	;
	
	

	
	//constructor
	public SignUpPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
			
	}
	
	// methods
	
	public void SignIn()
	{
		signin.click();

	}
	
	public void Email()
	{
		email.sendKeys("khalatemonika96@gmail.com");

	}
	
	public void Password()
	{
		password.sendKeys("Passw0rd");

	}
	
	public void Submit()
	{
		submit.click();

	}
	
	public void ForgotPassword()
	{
		forgotpassword.click();

	}
	
	public void CreateNewAccount()
	{
		createnewaccount.click();

	}
	
	
}
