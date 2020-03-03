package Test;

import java.sql.Time;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages.LoginPage;

public class CBEOrderProcess {
	
	WebDriver driver = null;
	/*public static WebDriver driver;
	public String baseUrl = "https://alpha.combinedbook.com/";
	*/
	
	@BeforeTest
public void setUpTest(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alpha.combinedbook.com/");
		driver.manage().window().maximize();
	}
	
	/*@BeforeTest
    public void beforeTest() {  
       String exePath = "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver_win32(1)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();  
        driver.get("https://alpha.combinedbook.com/");
    } */
	
	@Test
public void loginpage() {
		
		LoginPage.loginpage_username(driver).sendKeys("cbetest1@gmail.com");
		System.out.println("Test Completed Successfully for username");
		
		LoginPage.loginpage_password(driver).sendKeys("123456789");
		System.out.println("Test Completed Successfully for password");
		
		LoginPage.loginpage_loginbtn(driver).sendKeys(Keys.RETURN);
		System.out.println("Test Completed Successfully for loginbtn");
		
		LoginPage.beginwithorder(driver).click();
		System.out.println("Test Completed Successfully for begin with order");
		
		LoginPage.selectregisterforbookfairs(driver).click();	
		System.out.println("Test Completed Successfully for selectregisterforbook");
							
		LoginPage.selectregister_continuebtn(driver).click();
		System.out.println("Test Completed Successfully for continue button");	

       LoginPage.show_checkbox3(driver).click();
       System.out.println("Test Completed Successfully for select checkbox3");
       
       LoginPage.show_continuebtn(driver).click();
       System.out.println("Test Completed Successfully for Show_countinebtn");    
       
       LoginPage.selectexistingtitle(driver).click();
       System.out.println("Test Completed Successfully for Select Existing Title");  
       
       LoginPage.selecttitlefromddl(driver).click();
       System.out.println("Test Completed Successfully for Select Existing Title from DDL");  
       
       LoginPage.titleTandC(driver).click();
       System.out.println("Test Completed Successfully for Title page_Terms and Conditions");
       
       LoginPage.titlepagecontinuebtn(driver).click();
       System.out.println("Test Completed Successfully for Title page_continue button");
       /*
       LoginPage.AddOnServices(driver).click();
       System.out.println("Test Completed Successfully for Add-on Services");
       */
       /*
       LoginPage.SelectNewsletterMonthAndYear(driver).click();
       System.out.println("est Completed Successfully for Select Newsletter Month And Year");
       */
       LoginPage.ContinueRegistration(driver).click();
       System.out.println("Test Completed Successfully for Continue Registration");
       
       LoginPage.PubDetailspage(driver).click();
       System.out.println("Test Completed Successfully for checkbox selection of 'Same As Publisher Details'");
       
       LoginPage.OrderPreviewAndConfirmProcessOrder(driver).click();
       System.out.println("Test Completed Successfully for Process order");
                 
       
       LoginPage.PreviewDetailsPage(driver).click();
       System.out.println("Test Completed Successfully checkbox selection of 'I have reviewed the content and approve the information provided here.'");
       
       
       LoginPage.PreviewDetailsContinueButton(driver).click();
       System.out.println("Test Completed Successfully for Preview Details Continue button");
        
      /*  
       //********************************Payment Type_Credit Card ******************************************************* 
       LoginPage.CreditCardNumber(driver).sendKeys("4111111111111111");
       System.out.println("Test Completed Successfully entering for credit card number");
       
       LoginPage.CVV2(driver).sendKeys("123");
       System.out.println("Test Completed Successfully for entering CVV2 number");
       
       LoginPage.ExpirationMonth(driver).sendKeys("02");
       System.out.println("Test Completed Successfully for selecting expiration month");
       
       LoginPage.ExpirationYear(driver).sendKeys("05");
       System.out.println("Test Completed Successfully for selecting expiration month");
       
      */   
       
     //**********************************************Payment Type_Electronic Check**********************************
       LoginPage.ElectronicCheck(driver).click();
       System.out.println("Test Completed Successfully for Electronic Check");
       
       
       LoginPage.RoutingNumber(driver).sendKeys("123123123");
       System.out.println("Test Completed Successfully for entering routing number");
       
       LoginPage.AccountNumber(driver).sendKeys("123456789");
       System.out.println("Test Completed Successfully for entering accounting number");
       
       LoginPage.MakePayment(driver).click();
       System.out.println("Test Completed Successfully on clicking Make Payment button");
       
        
       //******************************************To download Packing Slip*************************************
       /*
       LoginPage.PackingSlip(driver).click();
       System.out.println("Test Completed Successfully on clicking on Packing Slip");
       */
  
       LoginPage.PreviousOrder(driver).click();
       System.out.println("Test Completed Successfully for Previous Order");
       
       
	} 
	 
	@AfterTest
public void tearDownTest() {
		
		
		//driver.close();
		//driver.quit();
		System.out.println("Test Completed Successfully...");
	}	

}
