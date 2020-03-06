package Test;

import java.sql.Time;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Webpages.CBEWebpages;



public class Test1_Loginpage {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loginpage();

	}
	
	public static void 	loginpage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
			
		//go to combined book exhibit
		driver.get("https://alpha.combinedbook.com/");
		
		//To maximize the window
		//driver.manage().window().maximize();
		
		//enter text in user name field
		//driver.findElement(By.id("txt_username")).sendKeys("cbetest1@gmail.com");
		
		CBEWebpages.loginpage_username(driver).sendKeys("cbetest1@gmail.com");
		
		
		//enter text in password field
		//driver.findElement(By.id("txt_password")).sendKeys("123456789");
		
		CBEWebpages.loginpage_password(driver).sendKeys("123456789");
		
		//click on login button
		//driver.findElement(By.id("btn_sub")).click();
		//driver.findElement(By.id("btn_sub")).sendKeys(Keys.RETURN);
		
		CBEWebpages.loginpage_loginbtn(driver).sendKeys(Keys.RETURN);
		
		CBEWebpages.beginwithorder(driver).click();
		
		//CBEWebpages.selectregisterforbook(driver).click();
		
		//LoginPage.selectregisterforbook_selectcheckbox(driver).click();
							
		CBEWebpages.selectregister_continuebtn(driver).click();
	
		
		//CBEWebpages.select_packages_shows(driver).click();
            
		//LoginPage.show_checkbox(driver).click();
		
	}

}
