package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
			
	
	
	public static WebElement loginpage_username(WebDriver driver) {
		
		element = driver.findElement(By.id("txt_username"));
		return element;		
	}
	
	public static WebElement loginpage_password(WebDriver driver) {
		
		element = driver.findElement(By.id("txt_password"));
		return element;
		
	}
	
	public static WebElement loginpage_loginbtn(WebDriver driver) {
		
		element = driver.findElement(By.id("btn_sub"));
		
		return element;
	}
	
	public static WebElement beginwithorder(WebDriver driver) {
		
		element = driver.findElement(By.linkText("Begin With Order"));
		return element;
	}
	
	public static WebElement selectregisterforbook(WebDriver driver) {
		element = driver.findElement(By.id("panelcollapseSix"));
		try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		return element;
	}
	
	public static WebElement selectregisterforbook_selectcheckbox(WebDriver driver) {
	
		//element = driver.findElement(By.xpath("//label[@for='chkdtexhibittitle']"));
		element = driver.findElement(By.xpath("//input[@id='chkdtexhibittitle']"));
		//element = driver.findElement(By.cssSelector("div.container:nth-child(4) div.demo-list:nth-child(8) div.panel-group div.panel.panel-default:nth-child(1)"));
		
		return element;
	}
	
	
	public static WebElement selectregister_continuebtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='disp_type_btn']"));
		//element = driver.findElement(By.id("disp_type_btn")); 
		//element = driver.findElement(By.linkText("Continue"));
		return element;
	}
	
	
	/*public static WebElement select_packages_shows(WebDriver driver) {
		element = driver.findElement(By.id("panelcollapseTwo"));
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		return element;
		
	  }    */
	

	
	/*public static WebElement show_checkbox(WebDriver driver) {
		driver.findElement(By.id("show_651"));
		return element;
	}
	*/


}
