package Webpages;

import java.util.List;

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
	
		element = driver.findElement(By.xpath("//label[@for='chkdtexhibittitle']"));
		return element;
	}
	
	/*public static WebElement selectregisterforbook_selectcheckbox(WebDriver driver) {
		List<WebElement> checkbox = driver.findElements(By.id("chkdtexhibittitle"));
		((WebElement) checkbox.get(0)).click();
		return element;
	}*/
	
		
	public static WebElement selectregister_continuebtn(WebDriver driver) {
		element = driver.findElement(By.id("disp_type_btn"));
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
