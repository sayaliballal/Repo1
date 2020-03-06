package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages.CBEWebpages;

public class CBEMenuBarSection {
WebDriver driver = null;
	
	@BeforeTest
public void setUpTest()
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alpha.combinedbook.com/");
		driver.manage().window().maximize();
	 }

	@Test
	public void CBEWebpages() {
		
		//************************************************CBE Top Bar Menu*********************************************

		CBEWebpages.AboutCBE(driver).click();
		System.out.println("Test Completed Successfully for About CBE");
		
		CBEWebpages.Resources(driver).click();
		System.out.println("Test Completed Successfully for Resources");
		
		CBEWebpages.Blog(driver).click();
		System.out.println("Test Completed Successfully for Blog");
		
		CBEWebpages.FAQs(driver).click();
		System.out.println("Test Completed Successfully for FAQ's");
		
		CBEWebpages.Testimonials(driver).click();
		System.out.println("Test Completed Successfully for Testimonials");
		
		CBEWebpages.Newsletter(driver).click();
		System.out.println("Test Completed Successfully for Newsletter");
		
		CBEWebpages.Contact_Us(driver).click();
		System.out.println("Test Completed Successfully for Contact Us");

		//********************************************************Main Menu***********************************************
		//--------------------------------------------Services------------------------------------------------
		
		CBEWebpages.Services(driver).click();
		System.out.println("Test Completed Successfully on clicking on Services link");
		
		CBEWebpages.ServicesDdlOption(driver).click();
		System.out.println("Test Completed Successfully for selecting drop down options as Print Book Display");
		
		//---------------------------------------------Home------------------------------------------------
		
		CBEWebpages.Home(driver).click();
		System.out.println("Test Completed Successfully on clicking on Home link");
		
		//------------------------------------Display Rates---------------------------------------------
		CBEWebpages.Display_Rates(driver).click();
		System.out.println("Test Completed Successfully on clicking on Display Rates link");
				
		CBEWebpages.Display_Rates_2020_NON_MEMBER_RATES(driver).click();
		System.out.println("Test Completed Successfully on clicking on 2020 NON MEMBER RATES button");
		
		
		//------------------------------------Book Shows---------------------------------------
		
		CBEWebpages.Book_Shows(driver).click();
		System.out.println("Test Completed Successfully On clicking on Book Shows");
		
		CBEWebpages.BookShows_ShowPastShows(driver).click();
		System.out.println("Test Completed Successfully for Show Past Shows");
		
		CBEWebpages.BookShows_ShowPastShows(driver).click();
		System.out.println("Test Completed Successfully for Hide Past Shows");
		
		CBEWebpages.ShowName(driver).click();
		System.out.println("Test Completed Successfully on clicking on 2020 London Book Fair New Title Showcase");
		
			
		//------------------------------------Show Catalogs & Reports-------------------------------------
		
		CBEWebpages.Show_Catalogs_And_Reports(driver).click();
		System.out.println("Test Completed Successfully on clicking on Show Catalogs & Reports link");
		
		CBEWebpages.View_2019_Catalogs_And_Reports(driver).click();
		System.out.println("Test Completed Successfully on clicking on View 2019 Catalogs & Reports");
		
		CBEWebpages.View_2021_Catalogs_And_Reports(driver).click();
		System.out.println("Test Completed Successfully on clicking on View 2021 Catalogs & Reports");
		
		CBEWebpages.View_2020_Catalogs_And_Reports(driver).click();
		System.out.println("Test Completed Successfully on clicking on View 2020 Catalogs & Reports");
		
		CBEWebpages.Show_Catalogs_And_Reports_Show_Name(driver).click();
		System.out.println("Test Completed Successfully on clicking on 2020 Guadalajara International Book Fair show");
		
		CBEWebpages.Show_Catalogs_And_Reports(driver).click();
		System.out.println("Test Completed Successfully on clicking on Show Catalogs & Reports link");
		
		CBEWebpages.eBook_Catalog(driver).click();
		System.out.println("Test Completed Successfully on clicking on eBook Catalog button");
		
		CBEWebpages.CatalogAndReportsBreadcrumb(driver).click();
		System.out.println("Test Completed Successfully on clicking on Catalog and Reports Breadcrumb");
		
		CBEWebpages.Online_Catalog(driver).click();
		System.out.println("Test Completed Successfully on clicking on Online Catalog button");
		
		CBEWebpages.Show_Catalogs_And_Reports(driver).click();
		System.out.println("Test Completed Successfully on clicking on Show Catalogs & Reports link");
		
		CBEWebpages.PDF_Catalog(driver).click();
		System.out.println("Test Completed Successfully on clicking on Show Catalogs & Reports link");
		
		CBEWebpages.ViewAlbum(driver).click();
		System.out.println("Test Completed Successfully on clicking on View Album link");
		
	}
	
	
	@AfterTest
	public void tearDownTest() {
			
			
			driver.close();
			driver.quit();
			System.out.println("Test Completed Successfully...");
		}	
	}
	
	
	
	
	
	
