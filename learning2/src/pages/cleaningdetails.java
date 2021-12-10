package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.lang.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class cleaningdetails {

WebDriver driver ;

public cleaningdetails(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c60-27']//span[@class='mat-button-wrapper']//*[local-name()='svg']")
public WebElement sdate1;

public void sdate1()  {
	sdate1.click();
}

@FindBy(how = How.XPATH, using ="//div[normalize-space()='1']")
public WebElement selectsdate1;

public void selectsdate1( )  {
	selectsdate1.click();
}
@FindBy(how = How.XPATH, using ="//button[@aria-label='Previous month']")
public WebElement prevmonth;

public void prevmonth( )  {
	prevmonth.click();
}
	@FindBy(how = How.XPATH, using ="//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c60-28']//span[@class='mat-button-wrapper']//*[local-name()='svg']")
	public WebElement edate1;

	public void edate1()  {
		edate1.click();
	}

	@FindBy(how = How.XPATH, using ="//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
	public WebElement selectedate1;

	public void selectedate1( )  {
		selectedate1.click();
	}
		@FindBy(how = How.XPATH, using ="/html/body/app-root/app-protected/div[2]/app-cleaningdetails/div[2]/section/div/div/div[1]/mat-card/form/div/div[3]/mat-form-field/div/div[1]/div[3]/input")
		public WebElement fromclient;

		public void fromclient(String from_client1 )  {
			fromclient.clear();
			fromclient.sendKeys("0");
		}
			@FindBy(how = How.XPATH, using ="/html[1]/body[1]/app-root[1]/app-protected[1]/div[2]/app-cleaningdetails[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
			public WebElement toclient;

			public void toclient(String to_client1 )  {
				toclient.clear();
				toclient.sendKeys("999999999999");
			}
	
			@FindBy(how = How.XPATH, using ="/html/body/app-root/app-protected/div[2]/app-cleaningdetails/div[2]/section/div/div/div[1]/mat-card/form/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")
			public WebElement devicetype;

			public void devicetype( )  {
				devicetype.click();
			}
			@FindBy(how = How.XPATH, using ="//span[contains(text(),'MilkAnalyzer')]")
			public WebElement selectdevicetype;

			public void selectdevicetype( )  {
				selectdevicetype.click();
			}
			@FindBy(how = How.XPATH, using ="//i[@class='fa fa-search']")
			public WebElement search;

			public void search( )  {
				search.click();
			}@FindBy(how = How.XPATH, using ="//i[@class='fa fa-file-excel-o']")
			public WebElement excel;

			public void excel( )  {
				excel.click();
			}
}



