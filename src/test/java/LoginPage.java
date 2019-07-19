import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\geckodrive\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alpha.combinedbook.com/"); 
	*/	
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.ballal\\eclipse-workspaceProjects\\CombinedBookExhibit\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://alpha.combinedbook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
	
		driver.findElement(By.id("txt_username")).sendKeys("cbetest1@gmail.com");
		driver.findElement(By.id("txt_password")).sendKeys("123456789");
		driver.findElement(By.id("btn_sub")).click();
		driver.findElement(By.linkText("Begin With Order")).click();
		driver.findElement(By.id("panelcollapseSix")).click();
		
		
		
		
		
	/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
		
		
		//driver.close();
		
	}

}
