package Webpages;

import java.util.List;
import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Exit;

public class LoginPage {
	
	private static WebElement element = null;
	private static WebDriver checkbox;
	
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
		return element;
	}
	
	/*
	public static WebElement selectregisterforbook_selectcheckbox(WebDriver driver) {
	
		element = driver.findElement(By.xpath("//label[@for='chkdtexhibittitle']"));
		//element = driver.findElement(By.id("chkdtexhibittitle"));
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return element;
		}*/
		
	public static WebElement selectregisterforbook_selectcheckbox(WebDriver driver) {
	        List<WebElement> checkbox = driver.findElements(By.xpath("//label[@for='chkdtexhibittitle']"));
	        ((WebElement) checkbox.get(0)).click();
	        
	        try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
					
	        return element;	
	}
	
		
	public static WebElement selectregister_continuebtn(WebDriver driver) {
		element = driver.findElement(By.id("disp_type_btn"));
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;	
	}
	
	
	public static WebElement select_packages_shows(WebDriver driver)
	{
		element = driver.findElement(By.id("panelcollapseTwo"));
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
		
	  } 

	public static WebElement  Pick_Individual_Shows(WebDriver driver){
	
		element = driver.findElement(By.xpath("//button[@class='blue_line pull-left btn_toggle line_sep_space']"));
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement show_checkbox(WebDriver driver) {
		//element = driver.findElement(By.id("show_651"));
		//element = driver.findElement(By.xpath("//input[@id='show_651']"));
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@id='mreg_651_print_title']"));
        ((WebElement) checkbox.get(0)).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
}

