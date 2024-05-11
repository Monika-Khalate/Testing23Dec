package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	
	//variables
	

	
		@FindBy(xpath="//a[@id='ui-id-5']")
				private WebElement men ;
		
		@FindBy(xpath="//a[@id='ui-id-17']")
		private WebElement top ;
		
		@FindBy(xpath="//a[@id='ui-id-20']")
		private WebElement hoodies ;
		
		@FindBy(xpath="(//a[@class='product-item-link'])[11]")
		private WebElement selectedhoodie ;
		
		@FindBy(xpath="(//div[@role='option'])[3]")
		private WebElement size ;
		
		
		@FindBy(xpath="(//div[@option-type='1'])[1]")
		private WebElement colour ;
		
		
		@FindBy(xpath="//input[@id='qty']")
		private WebElement quantity ;
		
		
		@FindBy(xpath="//span[text()='Add to Cart']")
		private WebElement addtocart ;
		
		@FindBy(xpath="//a[@class='action showcart']")
		private WebElement bucket ;
		
		@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
		private WebElement proceedtocheckout ;
		
		@FindBy(xpath=("(//input[@id='customer-email'])[1]"))
		private WebElement email	;
		
		//input[@name='login[username]']
		@FindBy(xpath=("//input[@name='firstname']"))
		private WebElement firstname	;


	@FindBy(xpath=("//input[@id='lastname']"))
	private WebElement lastname	;
	
	@FindBy(xpath="//input[@id='street_1']")
	private WebElement streetaddress ;

	@FindBy(xpath="//input[@id='city']")
	private WebElement city ;

	
	@FindBy(xpath="//select[@id='region_id']")
	private WebElement state ;

     @FindBy(xpath="//input[@id='zip']")
	private WebElement zipcode ;
		
     @FindBy(xpath="(//div[@class='control _with-tooltip'])[2]")
     private WebElement phonenumber ;
     
     
     @FindBy(xpath="  //span[text()='New Address']")
     private WebElement newaddress ;
     
     @FindBy(xpath=" (//input[@class='input-text'])[9]")
     private WebElement street;
     
     @FindBy(xpath=" (//input[@class='input-text'])[12]")
     private WebElement cityname;
     
     @FindBy(xpath=" (//select[@class='select'])[1]")
     private WebElement province;
     
   
     @FindBy(xpath="(//input[@class='input-text'])[14]")
     private WebElement postalcode;
     
     @FindBy(xpath="(//input[@class='input-text'])[15]")
     private WebElement contactnumber;
     
     
     @FindBy(xpath=" //span[text()='Ship here']")
     private WebElement shiphere;
     
  
     
     @FindBy(xpath=" (//input[@type='radio'])[2]")
     private WebElement shippingmethod ;
     
    
     @FindBy(xpath="(//button[@type='submit'])[2]")
     private WebElement next ;

     @FindBy(xpath=" //span[text()='Place Order']")
     private WebElement placeorder ;

  
  
		
		private WebDriver driver;
		private Actions act;
		private JavascriptExecutor js;

	//constructor
	public ProductPage(WebDriver driver)
	{

		act = new Actions(driver);
		this.driver= driver;
		js=(JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Men()
	{
		
		act.moveToElement(men).perform();
	}

	
	public void Top()
	{
		
		act.moveToElement(top).perform();
	}
	
	public void Hoodies()
	{
		
		hoodies.click();
	}
	
	public void SelectedHoodie()
	{
		
		selectedhoodie.click();
	}
	
	public void Size()
	{
		
		size.click();
	}
	
	public void Colour()
	{
		
		colour.click();
	}
	
	public void Quantity() throws InterruptedException
	{
		Thread.sleep(3000);
		quantity.clear();
		quantity.sendKeys("2");
	}
	
	public void AddToCart()
	{
		
		addtocart.click();
	}
	
	
	public void Bucket() throws InterruptedException
	{
		Thread.sleep(3000);
		bucket.click();
	}
	
	public void ProceedToCheckout() throws InterruptedException
	{
		Thread.sleep(3000);
		proceedtocheckout.click();
		
	}
	
	
//	public void Email(String mailid) throws InterruptedException
//	{
//		Thread.sleep(3000);
//		email.sendKeys(mailid);
//
//	}
//	
//	
//	public void FirstName(String fname)
//	{
//		firstname.sendKeys(fname);
//
//	}
//
//	public void LastName(String lname)
//	{
//		lastname.sendKeys(lname);
//
//	}
//	
//	
//	public void StreetAddress(String address)
//	{
//		streetaddress.sendKeys(address);
//	}
//	
//	public void City(String cityname)
//	{
//		city.sendKeys(cityname);
//	}
//	
//	public void State()
//	{
//		Select s = new Select(state);
//		s.selectByValue("24");
//	}
//	
//	public void ZipCode(String code)
//	{
//		zipcode.sendKeys(code);
//	}
//	
//	public void PhoneNumber(String number)
//	{
//		phonenumber.sendKeys(number);
//	}

	
	public void NewAddress() throws InterruptedException
	{
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", newaddress);
		newaddress.click();
	}
	
	
	public void Street(String add) throws InterruptedException
	{
		Thread.sleep(3000);
		
		street.sendKeys(add);
		
	}
	
	public void CityName(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		cityname.sendKeys(name);
		
	}
	
	public void Province()
	{
		Select s = new Select(province);
		s.selectByValue("24");
	}
	
	public void PostalCode(String zipcode)
	{
		
		postalcode.sendKeys(zipcode);
		
	}
	
	public void ContactNumber(String phone)
	{
		
		contactnumber.sendKeys(phone);
		
	}
	
	public void ShipHere()
	{
		
		shiphere.click();
		
	}
	
	public void ShippingMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", shippingmethod);
		shippingmethod.click();
	}
	
	public void Next() throws InterruptedException
	{
		Thread.sleep(3000);
		//js.executeScript("arguments[0].scrollIntoView(true)", next);
		next.click();
	}
	
	
	public void PlaceOrder() throws InterruptedException
	{
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", placeorder);
		placeorder.click();
		
	}
	
	
}
