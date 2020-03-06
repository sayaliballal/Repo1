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

public class CBEMyAccountSection {
	
	WebDriver driver = null;
	
	@BeforeTest
public void setUpTest(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alpha.combinedbook.com/");
		driver.manage().window().maximize();
	}

	
@Test
public void CBEWebpages() {
	
	CBEWebpages.loginpage_username(driver).sendKeys("cbetest1@gmail.com");
	System.out.println("Test Completed Successfully for username");
	
	CBEWebpages.loginpage_password(driver).sendKeys("123456789");
	System.out.println("Test Completed Successfully for password");
	
	CBEWebpages.loginpage_loginbtn(driver).sendKeys(Keys.RETURN);
	System.out.println("Test Completed Successfully for loginbtn");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
	//-----------------------------------Previous Order Page--------------------------------
	
	CBEWebpages.PreviousOrders(driver).click();
	System.out.println("Test Completed Successfully on clicking on Previous Orders link");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
	//-----------------------------------Edit Profile page----------------------------------
	CBEWebpages.EditProfile(driver).click();
	System.out.println("Test Completed Successfully on clicking on Edit Profile link");
	
	CBEWebpages.EditProfileCatalogInformation(driver).click();
	System.out.println("Test Completed Successfully For selecting checkbox of 'Update my basic catalog details with same as above.'");
	
	CBEWebpages.EditProfileSubmitbtn(driver).click();
	System.out.println("Test Completed Successfully on clicking on Submit button");
	
	CBEWebpages.ProfileUpdatedClickHereLink(driver).click();
	System.out.println("Test Completed Successfully on clicking on Click here link");

	
	//-------------------Manage Titles Page--------------------------------
	CBEWebpages.ManageTitles(driver).click();
	System.out.println("Test Completed Successfully on clicking on Manage Titles link'");
	
	CBEWebpages.ManageTitlesNextPagination(driver).click();
	System.out.println("Test Completed Successfully on clicking on > arrow");
	
	CBEWebpages.ManageTitlesLastPagination(driver).click();
	System.out.println("Test Completed Successfully on clicking on >> arrow");
	
	CBEWebpages.EditBookTitle(driver).click();
	System.out.println("Test Completed Successfully on clicking on Edit book title icon");
	
	CBEWebpages.UpdateTitle(driver).sendKeys("This is test message, please ignore it");
	System.out.println("Test Completed Successfully for Update title");
	
	CBEWebpages.SelectCheckboxforBuyFrom(driver).click();
	System.out.println("Test Completed Successfully for selecting checkbox for Buy From option");
	
	CBEWebpages.SaveChangesbtn(driver).click();
	System.out.println("Test Completed Successfully on clicking on Save Changes button");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
	//---------------------------------Pricing Page-----------------------------
	
	CBEWebpages.Pricing(driver).click();
	System.out.println("Test Completed Successfully on clicking on Pricing link");
	
	CBEWebpages.Pricing_Non_Member_Rates(driver).click();
	System.out.println("Test Completed Successfully on clicking on Non Member Rates");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
    //--------------------------------Advertising Page---------------------------	
   	CBEWebpages.Advertising(driver).click();
	System.out.println("Test Completed Successfully on clicking on Advertising link");
	
	CBEWebpages.Advertising_Select_Show_Checkbox(driver).click();
	System.out.println("Test Completed Successfully for selectind advertising show checkbox");
	
	CBEWebpages.Add_Catalog_Advertising_to_Order(driver).click();
	System.out.println("Test Completed Successfully on clicking on Add Catalog Advertising to Order");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
	//----------------------------------Autographing Slot Page--------------------------
	CBEWebpages.AutographingSlot(driver).click();
	System.out.println("Test Completed Successfully on clicking on Autographing Slot link");
	
	CBEWebpages.Select_Show_for_Autographing_Slot(driver).click();
	System.out.println("Test Completed Successfully for selecting show for Autographing Slot");
	
	CBEWebpages.Slot_Selection_And_Confirm_button(driver).click();
	System.out.println("Test Completed Successfully on clicking on Slot Selecting & Confirm button");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
	//----------------------------------Featured Title page-----------------------------
	
	CBEWebpages.FeaturedTitle(driver).click();
	System.out.println("Test Completed Successfully on clicking on Featured Title in Newsletter to 30 thousand Librarians link");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	
	//-----------------------------------Member Benefits page----------------------------
	CBEWebpages.MemberBenefits(driver).click();
	System.out.println("Test Completed Successfully on clicking on Member Benefits link'");
	
	CBEWebpages.MyAccount(driver).click();
	System.out.println("Test Completed Successfully on clicking on My Account link");
	
	CBEWebpages.Logout(driver).click();
	System.out.println("Test Completed Successfully on clicking on Logout link'");
	
	
	//------------------------------Trade Show Schedule page------------------------------
	CBEWebpages.loginpage_username(driver).sendKeys("cbetest1@gmail.com");
	System.out.println("Test Completed Successfully for username");
	
	CBEWebpages.loginpage_password(driver).sendKeys("123456789");
	System.out.println("Test Completed Successfully for password");
	
	CBEWebpages.loginpage_loginbtn(driver).sendKeys(Keys.RETURN);
	System.out.println("Test Completed Successfully for loginbtn");
	
	CBEWebpages.Trade_show_Schedule(driver).click();
	System.out.println("Test Completed Successfully on clicking on Trade show Schedule link");
		

}


@AfterTest
public void tearDownTest() {
		
		
		//driver.close();
		//driver.quit();
		System.out.println("Test Completed Successfully...");
	}	
}
