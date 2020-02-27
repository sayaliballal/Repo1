package Webpages;

import java.util.List;
import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Exit;

public class LoginPage{
	
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
	
	
	public static WebElement selectregisterforbookfairs(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div/div[1]/div[1]/div/div/ins"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
			
	public static WebElement selectregister_continuebtn(WebDriver driver) {
		//element = driver.findElement(By.id("disp_type_btn"));
		element = driver.findElement(By.xpath("//*[@id=\"disp_type_btn\"]"));
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;	
	}
	
	public static WebElement show_checkbox3(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"select_packages_shows_tbfirst\"]/tbody/tr[3]/td[3]/div/ins"));
		//element.click();
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement show_continuebtn(WebDriver driver) {
		    element = driver.findElement(By.xpath("//*[@id=\"shows_btn\"]"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			
			return element;
		}
			
	public static WebElement selectexistingtitle(WebDriver driver) {
		    element = driver.findElement(By.xpath("//*[@id=\"cmbBook1\"]")); 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			
			return element;
		}
		
	public static WebElement selecttitlefromddl(WebDriver driver) {
			element = driver.findElement(By.xpath("//*[@id=\"cmbBook1\"]/option[13]"));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			
			return element;
		}
	
	public static WebElement titleTandC(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[2]/div/div[3]/div/div/table/tbody/tr/td/div/ins"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement titlepagecontinuebtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"titile_next\"]"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	/*// AddOn services, it's a optional 
	public static WebElement AddOnServices(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"div_featured_title\"]/div[1]/span/div/ins"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	*/
	/*//SelectNewsletterMonthAndYear it's an optional 
	public static WebElement SelectNewsletterMonthAndYear(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"chkTBCNewsletter_listing\"]/div/table/tbody/tr/td[2]/div[4]/div/ins"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	*/
	
	public static WebElement ContinueRegistration(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"addon_next\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement PubDetailspage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Register_main\"]/div[2]/div/div[2]/div[3]/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement OrderPreviewAndConfirmProcessOrder(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"SubmitBtn\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement PreviewDetailsPage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"online_catalogs\"]/div[4]/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	
	public static WebElement PreviewDetailsContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"titile_next\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement CreditCardNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"CC_NUM\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement CVV2(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"CVCCVV2\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement ExpirationMonth(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"CC_EXPIRES\"]/option[01]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	
	
		
	}




















