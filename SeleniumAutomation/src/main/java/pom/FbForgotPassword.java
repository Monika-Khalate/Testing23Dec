package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbForgotPassword {
	
	//variable - private => WebElement
	
		@FindBy(xpath = ("//table//td//div"))
		private WebElement message ; 
		
		
		@FindBy(xpath = ("//input[@type='textl']"))
		private WebElement emailOrPhoneNumber ; 
		
		
		@FindBy(xpath = ("(//a[@role='button'])[1]"))
		private WebElement cancelButton ; 
		
		
		@FindBy(xpath = ("//button[@id='did_submit']"))
		private WebElement searchButton ; 
		
		
		
		
		//constructor - public => WebElement Initialization
		
		public FbForgotPassword(WebDriver driver)
		{
		
			PageFactory.initElements(driver, this);
			
		}
		
		
		//method - public => Action on WebElement
		
		// for single actions
		public void getMessage(String userId)
		{
			 message.getText();
		}
		
		public void sendEmailOrPhoneNo(String userId)
		{
			emailOrPhoneNumber.sendKeys(userId);
		}

		
		public void clickOnCancelButton()
		{
			cancelButton.clear();
		}
		
		public void clickOnSearchButton()
		{
			searchButton.click();
		}



}
