package Test;

import java.sql.Time;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages.CBEWebpages;

public class CBEOrderProcess {
	
	WebDriver driver = null;
	/*public static WebDriver driver;
	public String baseUrl = "https://alpha.combinedbook.com/";
	*/
	
	@BeforeTest
public void setUpTest(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver_win32 (1)\\chromedriver2.exe");
		                                               
		driver = new ChromeDriver();
		driver.get("https://alpha.combinedbook.com/");
		driver.manage().window().maximize();
	}
	
	/*@BeforeTest
    /*public void beforeTest() {  
       String exePath = "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver_win32(1)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();  
        driver.get("https://alpha.combinedbook.com/");
    } */
	
	@Test
public void CBEWebpages() {
		
		CBEWebpages.loginpage_username(driver).sendKeys("cbetest1@gmail.com");
		System.out.println("Test Completed Successfully for username");
		
		CBEWebpages.loginpage_password(driver).sendKeys("123456789");
		System.out.println("Test Completed Successfully for password");
		
		CBEWebpages.loginpage_loginbtn(driver).sendKeys(Keys.RETURN);
		System.out.println("Test Completed Successfully for loginbtn");
		
		CBEWebpages.beginwithorder(driver).click();
		System.out.println("Test Completed Successfully for begin with order");
		
		CBEWebpages.selectregisterforbookfairs(driver).click();	
		System.out.println("Test Completed Successfully for selectregisterforbook");
							
		CBEWebpages.selectregister_continuebtn(driver).click();
		System.out.println("Test Completed Successfully for continue button");	

		CBEWebpages.show_checkbox3(driver).click();
       System.out.println("Test Completed Successfully for select checkbox3");
       
       CBEWebpages.show_continuebtn(driver).click();
       System.out.println("Test Completed Successfully for Show_countinebtn");    
       
       CBEWebpages.selectexistingtitle(driver).click();
       System.out.println("Test Completed Successfully for Select Existing Title");  
       
       CBEWebpages.selecttitlefromddl(driver).click();
       System.out.println("Test Completed Successfully for Select Existing Title from DDL");  
       
       CBEWebpages.titleTandC(driver).click();
       System.out.println("Test Completed Successfully for Title page_Terms and Conditions");
       
       CBEWebpages.titlepagecontinuebtn(driver).click();
       System.out.println("Test Completed Successfully for Title page_continue button");
       /*
       CBEWebpages.AddOnServices(driver).click();
       System.out.println("Test Completed Successfully for Add-on Services");
       */
       /*
       CBEWebpages.SelectNewsletterMonthAndYear(driver).click();
       System.out.println("est Completed Successfully for Select Newsletter Month And Year");
       */
       CBEWebpages.ContinueRegistration(driver).click();
       System.out.println("Test Completed Successfully for Continue Registration");
       
       CBEWebpages.PubDetailspage(driver).click();
       System.out.println("Test Completed Successfully for checkbox selection of 'Same As Publisher Details'");
       
       CBEWebpages.StreetAddress(driver).sendKeys("abc");
       System.out.println("Test Completed Successfully for Street Address");
       
       CBEWebpages.OrderPreviewAndConfirmProcessOrder(driver).click();
       System.out.println("Test Completed Successfully for Process order");
                 
       
       CBEWebpages.PreviewDetailsPage(driver).click();
       System.out.println("Test Completed Successfully checkbox selection of 'I have reviewed the content and approve the information provided here.'");
       
       
       CBEWebpages.PreviewDetailsContinueButton(driver).click();
       System.out.println("Test Completed Successfully for Preview Details Continue button");
        
      /*  
       //********************************Payment Type_Credit Card ******************************************************* 
       CBEWebpages.CreditCardNumber(driver).sendKeys("4111111111111111");
       System.out.println("Test Completed Successfully entering for credit card number");
       
       CBEWebpages.CVV2(driver).sendKeys("123");
       System.out.println("Test Completed Successfully for entering CVV2 number");
       
       CBEWebpages.ExpirationMonth(driver).sendKeys("02");
       System.out.println("Test Completed Successfully for selecting expiration month");
       
       CBEWebpages.ExpirationYear(driver).sendKeys("05");
       System.out.println("Test Completed Successfully for selecting expiration month");
       
      */   
       
     //**********************************************Payment Type_Electronic Check**********************************
       CBEWebpages.ElectronicCheck(driver).click();
       System.out.println("Test Completed Successfully for Electronic Check");
       
       
       CBEWebpages.RoutingNumber(driver).sendKeys("123123123");
       System.out.println("Test Completed Successfully for entering routing number");
       
       CBEWebpages.AccountNumber(driver).sendKeys("123456789");
       System.out.println("Test Completed Successfully for entering accounting number");
       
       CBEWebpages.MakePayment(driver).click();
       System.out.println("Test Completed Successfully on clicking Make Payment button");
       
        
       //******************************************To download Packing Slip*************************************
       
       CBEWebpages.PackingSlip(driver).click();
       System.out.println("Test Completed Successfully on clicking on Packing Slip");
       
  
       /*
       CBEWebpages.PreviousOrder(driver).click();
       System.out.println("Test Completed Successfully for Previous Order");
       */
       
	} 
	 
	@AfterTest
public void tearDownTest() {
		
		
		//driver.close();
		//driver.quit();
		System.out.println("Test Completed Successfully...");
	}	

}
