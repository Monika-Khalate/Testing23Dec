package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.CreateNewAccount;
import pom.MyAccountPage;
import pom.ProductPage;
import pom.SignUpPage;

public class TestLuma {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		
		// CreateNewAccount class object
		
//		CreateNewAccount ca = new CreateNewAccount(driver);
//		ca.CreateAnAccount();
//		ca.FirstName();
//		ca.LastName();
//		ca.Email();
//		ca.Password();
//		ca.ConfirmPassword();
//		ca.createaccount();
	
		
		
		//SignUpPage class object
//		SignUpPage sp = new SignUpPage(driver);
//		sp.SignIn();
//		sp.Email();
//		sp.Password();
//		sp.Submit();
	//	sp.ForgotPassword();
	//	sp.CreateNewAccount();
		
		
		
		//ProductPage class object
//		ProductPage pp = new ProductPage(driver);
//		pp.Men();
//		pp.Top();
//		pp.Hoodies();
//		pp.SelectedHoodie();
//		pp.Size();
//		pp.Colour();
//		pp.Quantity();
//		pp.AddToCart();
//        pp.Bucket();
//		pp.ProceedToCheckout();
		
		
//		pp.Email("khalatemonika96@gmail.com");
//		pp.FirstName("Monika");
//		pp.LastName("Khalate");
//		pp.StreetAddress("Magarpatta city");
//		pp.City("Pune");
//		pp.State();
//		pp.ZipCode("411036");
//		pp.PhoneNumber("7798463565");
		
		
//		pp.NewAddress();
//		pp.Street("Magarpatta city");
//		pp.CityName("Pune");
//		pp.Province();
//		pp.PostalCode("411036");
//		pp.ContactNumber("7798463565");
//		pp.ShipHere();
//		pp.ShippingMethod();
// 	    pp.Next();
//		pp.PlaceOrder();
		
		
		
		// MyAccountPage class object
//		MyAccountPage map = new MyAccountPage(driver);
//		map.SignIn();
//		map.Email("khalatemonika96@gmail.com");
//		map.Password("Passw0rd");
//		map.Submit();
//		map.WelcomeMessage();
//		map.MyAccountOpen();
//		map.ManageAddress();
//		map.PhoneNumber("7798463565");
//		map.StreetAddress("Magarpatta city");
//		map.City("Pune");
//		map.State();
//		map.ZipCode("411036");
//		map.SaveAddress();
//		map.AddNewAddress();
		
	}

}
