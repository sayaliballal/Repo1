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

public class Test2 {
	
	WebDriver driver = null;
	
	@BeforeTest
public void setUpTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alpha.combinedbook.com/");
		//driver.manage().window().maximize();
	}
	
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
		
		LoginPage.selectregisterforbook(driver).click();
		System.out.println("Test Completed Successfully for selectregisterforbook");
			
		LoginPage.selectregisterforbook_selectcheckbox(driver).click();
		System.out.println("Test Completed Successfully for chkdtexhibittitle");
	     							
		LoginPage.selectregister_continuebtn(driver).click();
		System.out.println("Test Completed Successfully for continue button");	
		
        LoginPage.select_packages_shows(driver).click();
        System.out.println("Test Completed Successfully for select_packages_shows");
	        
        LoginPage.Pick_Individual_Shows(driver).click();
        System.out.println("Test Completed Successfully for Pick_Individual_Shows");
        
       LoginPage.show_checkbox(driver).click();
       System.out.println("Test Completed Successfully for show_checkbox");
            	
	}
	
	@AfterTest
public void tearDownTest() {
		
		//driver.close();
		//driver.quit();
		System.out.println("Test Completed Successfully...");
	}	

}
