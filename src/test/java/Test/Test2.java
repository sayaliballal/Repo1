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
	}
	
	@Test
public void loginpage() {
		
		LoginPage.loginpage_username(driver).sendKeys("cbetest1@gmail.com");
		
		LoginPage.loginpage_password(driver).sendKeys("123456789");
		
		LoginPage.loginpage_loginbtn(driver).sendKeys(Keys.RETURN);
		
		LoginPage.beginwithorder(driver).click();
		
		LoginPage.selectregisterforbook(driver).click();
		
		LoginPage.selectregisterforbook_selectcheckbox(driver).click();
							
		LoginPage.selectregister_continuebtn(driver).click();
		
        LoginPage.select_packages_shows(driver).click();
            	
	}
	
	@AfterTest
public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}	

}
