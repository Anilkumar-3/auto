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


public class searcherror {

WebDriver driver ;

public searcherror(WebDriver driver) {
this.driver = driver ; }



@FindBy(how = How.XPATH, using ="//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c60-27']//span[@class='mat-button-wrapper']//*[local-name()='svg']")
public WebElement sdate;

public void sdate()  {
	sdate.click();
}
@FindBy(how = How.XPATH, using ="//button[@aria-label='Previous month']")
public WebElement prevmonth;

public void prevmonth( )  {
	prevmonth.click();
}

@FindBy(how = How.XPATH, using ="//div[normalize-space()='1']")
public WebElement selectsdate;

public void selectsdate( )  {
	selectsdate.click();
}

	@FindBy(how = How.XPATH, using ="//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c60-28']//span[@class='mat-button-wrapper']//*[local-name()='svg']")
	public WebElement edate;

	public void edate()  {
		edate.click();
	}

	@FindBy(how = How.XPATH, using ="//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
	public WebElement selectedate;

	public void selectedate( )  {
		selectedate.click();
	}
		@FindBy(how = How.XPATH, using ="/html/body/app-root/app-protected/div[2]/app-errorlogs/div[2]/section/div/div/div[1]/mat-card/form/div/div[3]/mat-form-field/div/div[1]/div[3]/input")
		public WebElement fromclient;

		public void fromclient(String from_client )  {
			fromclient.clear();
			fromclient.sendKeys("0");
		}
			@FindBy(how = How.XPATH, using ="/html/body/app-root/app-protected/div[2]/app-errorlogs/div[2]/section/div/div/div[1]/mat-card/form/div/div[4]/mat-form-field/div/div[1]/div[3]/input")
			public WebElement toclient;

			public void toclient(String to_client )  {
				toclient.clear();
				toclient.sendKeys("999999999999");
			}
	
			@FindBy(how = How.XPATH, using ="/html/body/app-root/app-protected/div[2]/app-errorlogs/div[2]/section/div/div/div[1]/mat-card/form/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")
			public WebElement devicetype;

			public void devicetype( )  {
				devicetype.click();
			}
			@FindBy(how = How.XPATH, using ="//span[normalize-space()='MilkAnalyzer']")
			public WebElement selectdevicetype;

			public void selectdevicetype( )  {
				selectdevicetype.click();
			}
			@FindBy(how = How.XPATH, using ="//button[@name='Search']")
			public WebElement search;

			public void search( )  {
				search.click();
			}@FindBy(how = How.XPATH, using ="//button[@class='btn btn-save btn-search ml-2 ng-star-inserted']")
			public WebElement excel;

			public void excel( )  {
				excel.click();
			}
}


