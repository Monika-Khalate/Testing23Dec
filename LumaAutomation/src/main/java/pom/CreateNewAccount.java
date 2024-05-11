package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {
	
	
	//variables
	
	
			
	@FindBy(xpath=("(//a[text()='Create an Account'])[1]"))
			private WebElement createanaccount	;
	
	@FindBy(xpath=("//input[@name='firstname']"))
	private WebElement firstname	;


@FindBy(xpath=("//input[@id='lastname']"))
private WebElement lastname	;


@FindBy(xpath=("(//input[@type='email'])[1]"))
private WebElement email	;


@FindBy(xpath=("//input[@id='password']"))
private WebElement password	;


@FindBy(xpath=("//input[@title='Confirm Password']"))
private WebElement confirmpassword	;
		

@FindBy(xpath=("(//span[text()='Create an Account'])[1]"))
private WebElement createaccount	;

//(//span[text()='Create an Account'])[1]


//constructor
public CreateNewAccount(WebDriver driver)
{

	PageFactory.initElements(driver, this);
	
}

// methods

public void CreateAnAccount()
{
	createanaccount.click();

}


public void FirstName()
{
	firstname.sendKeys("Monika");

}

public void LastName()
{
	lastname.sendKeys("Khalate");

}

public void Email()
{
	email.sendKeys("khalatemonika96@gmail.com");

}

public void Password()
{
	password.sendKeys("Passw0rd");

}

public void ConfirmPassword()
{
	confirmpassword.sendKeys("Passw0rd");

}


public void createaccount()
{
	createaccount.click();
}


}
