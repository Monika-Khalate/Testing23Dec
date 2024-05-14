package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.FbForgotPassword;
import pom.FbLoginOrSignUpPage;

public class TestClass {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();    // driver is a local variable of main method
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//1. object create for pom class
		//2. declaring non static properties(webelements & methods)
		//3. constructor code will execute , initialization of webelements
		//4.
		FbLoginOrSignUpPage fbLoginOrSignUpPage = new FbLoginOrSignUpPage(driver); // webdriver type argument => (driver)
		                                                                           // stored object of chromedriver
		
		fbLoginOrSignUpPage.sendUserName("velocity@1234");
		fbLoginOrSignUpPage.sendPassword("12345");
		fbLoginOrSignUpPage.clickOnForgotPasswordButton();
		
		
		FbForgotPassword fbForgotPassword = new FbForgotPassword(driver);
		//String message= fbForgotPassword.getMessage();
		
		fbForgotPassword.sendEmailOrPhoneNo("Velocity@1234");
		//fbForgotPassword.clickOnSearchButton();
		
		
	}

}
