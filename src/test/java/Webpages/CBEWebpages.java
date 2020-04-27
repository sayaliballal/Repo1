package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CBEWebpages{
	
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
	
//******************************************************* CBE Order Process**********************************************************	
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
	
	public static WebElement StreetAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"street\"]"));
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

	/*----------------------------------------Payment Type_Credit Card------------------------------------------------------------
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
		element = driver.findElement(By.xpath("//*[@id=\"CC_EXPIRES\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	
	public static WebElement ExpirationYear(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div/form/fieldset[2]/ul/li[4]/div[2]/div[2]/select"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	*/
		//------------------------------------Payment Type_Electronic Check-------------------------------------------------------
	public static WebElement ElectronicCheck(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div/form/fieldset[1]/ul/li/div/ul/li[2]/div/label/span/i"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement RoutingNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ACH_ROUTING\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement AccountNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ACH_ACCOUNT\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement MakePayment(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div/form/fieldset[5]/ul/li/div/input[1]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		 
	 //---------------------------------------To download Packing Slip---------------------------------------------------
	 
	public static WebElement PackingSlip(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view_order\"]/p[3]/a[1]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	 	
	public static WebElement PreviousOrder(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"my_accout_lt\"]/ul/li[7]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	
	//****************************************************CBE My Account Section********************************************************
	
	public static WebElement MyAccount(WebDriver driver) {
		element = driver.findElement(By.linkText("My Account"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement PreviousOrders(WebDriver driver) {
		element = driver.findElement(By.linkText("Previous Orders"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement EditProfile(WebDriver driver) {
		element = driver.findElement(By.linkText("Edit Profile"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement EditProfileCatalogInformation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"frmEditProfile\"]/div[3]/table/tbody/tr/td[1]/span/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement EditProfileSubmitbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement ProfileUpdatedClickHereLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Click here"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement ManageTitles(WebDriver driver) {
		element = driver.findElement(By.linkText("Manage Titles"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement ManageTitlesNextPagination(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Display_Rates\"]/form/div[8]/ul/ul/li[3]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement ManageTitlesLastPagination(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Display_Rates\"]/form/div[8]/ul/ul/li[6]/a/i"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement EditBookTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"test\"]/tbody/tr[2]/td[6]/a[1]/i"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement UpdateTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"txtAwards\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement SelectCheckboxforBuyFrom(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"EditbooktitleForm\"]/div[31]/div/div/table/tbody/tr/td[1]/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement SaveChangesbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement Pricing(WebDriver driver) {
		element = driver.findElement(By.linkText("Pricing"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement Pricing_Non_Member_Rates(WebDriver driver) {
		element = driver.findElement(By.linkText("NON MEMBER RATES"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement Advertising(WebDriver driver) {
		element = driver.findElement(By.linkText("Advertising"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}

	public static WebElement Advertising_Select_Show_Checkbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"frmAdvertisement\"]/table/tbody/tr[1]/td[1]/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Add_Catalog_Advertising_to_Order(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"add_advertisement\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement AutographingSlot(WebDriver driver) {
		element = driver.findElement(By.linkText("Autographing Slot"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Select_Show_for_Autographing_Slot(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[1]/td[1]/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Slot_Selection_And_Confirm_button(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"add_auto_graph_slot\"]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement FeaturedTitle(WebDriver driver) {
		element = driver.findElement(By.linkText("Featured Title in Newsletter to 30 thousand Librarians"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement MemberBenefits(WebDriver driver) {
		element = driver.findElement(By.linkText("Member Benefits"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Logout(WebDriver driver) {
		element = driver.findElement(By.linkText("Logout"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Trade_show_Schedule(WebDriver driver) {
		element = driver.findElement(By.linkText("Trade show Schedule"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement Book_Shows(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-5931\"]/a")); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement BookShows_ShowPastShows(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Display_Rates\"]/div[2]/div[1]/div/ins"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	 
	public static WebElement ShowName(WebDriver driver) {
		element = driver.findElement(By.linkText("2020 Bologna Children's Book Fair"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	//************************************************CBE Top Bar Menu*********************************************
	
	
	public static WebElement AboutCBE(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Register_act\"]/header/div[1]/div/div/div[2]/a[1]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement Resources(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-6153\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Blog(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-6010\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement FAQs(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-5941\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Testimonials(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-6203\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Newsletter(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-5942\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Contact_Us(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-5945\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	
	//********************************************************Main Menu***********************************************
	public static WebElement Services(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-6147\"]/a")); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement ServicesDdlOption(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-6075\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();} 
		
		return element;
	}
	
	public static WebElement Home(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-6290\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Display_Rates(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-5930\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
		
	public static WebElement Display_Rates_2020_NON_MEMBER_RATES(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Display_Rates\"]/ul/li[2]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Show_Catalogs_And_Reports(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu-item-5932\"]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement View_2019_Catalogs_And_Reports(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[1]/a[1]/span"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement View_2021_Catalogs_And_Reports(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[1]/a[2]/span"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement View_2020_Catalogs_And_Reports(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[1]/a[1]/span")); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Show_Catalogs_And_Reports_Show_Name(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[3]/table/tbody/tr[1]/td[1]/a"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement eBook_Catalog(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[3]/table/tbody/tr[1]/td[3]/div[1]/a"));
		                                       
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement CatalogAndReportsBreadcrumb(WebDriver driver) {
		//element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[2]/a"));  
		element = driver.findElement(By.linkText("Catalog and Reports"));
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	public static WebElement Online_Catalog(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[3]/table/tbody/tr[1]/td[3]/div[2]/a"));
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
			
	
	public static WebElement PDF_Catalog(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[3]/table/tbody/tr[1]/td[3]/div[3]/a"));
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	
	public static WebElement ViewAlbum(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"catalogs_reports\"]/div[3]/table/tbody/tr[1]/td[4]/a"));
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return element;
	}
	
	}





















