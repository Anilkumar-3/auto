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


public class calibrationhistory {

WebDriver driver ;

public calibrationhistory(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//body/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
public WebElement sdate;

public void sdate()  {
	sdate.click();
}


@FindBy(how = How.CSS, using ="td[aria-label='Fri Jul 02 2021'] div[class='mat-calendar-body-cell-content']")
public WebElement selectsdate;

public void selectsdate( )  {
	selectsdate.click();
}

	@FindBy(how = How.XPATH, using ="//body/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
	public WebElement edate;

	public void edate()  {
		edate.click();
	}

	@FindBy(how = How.XPATH, using ="//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
	public WebElement selectedate;

	public void selectedate( )  {
		selectedate.click();
	}
		@FindBy(how = How.XPATH, using ="/html[1]/body[1]/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
		public WebElement fromclient;

		public void fromclient(String from_client2 )  {
			fromclient.clear();
			fromclient.sendKeys("0");
		}
			@FindBy(how = How.XPATH, using ="/html[1]/body[1]/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
			public WebElement toclient;

			public void toclient(String to_client2 )  {
				toclient.clear();
				toclient.sendKeys("999999999999");
			}
	
			@FindBy(how = How.XPATH, using ="//body/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]")
			public WebElement devicetype;

			public void devicetype( )  {
				devicetype.click();
			}
			@FindBy(how = How.XPATH, using ="//span[contains(text(),'MilkAnalyzer')]")
			public WebElement selectdevicetype;

			public void selectdevicetype( )  {
				selectdevicetype.click();
			}
			@FindBy(how = How.XPATH, using ="//body/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[2]/div[3]/div[1]/button[1]")
			public WebElement search;

			public void search( )  {
				search.click();
			}@FindBy(how = How.XPATH, using ="//body/app-root[1]/app-protected[1]/div[3]/app-calibrationhistory[1]/div[2]/section[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[2]/div[3]/div[1]/button[2]")
			public WebElement excel;

			public void excel( )  {
				excel.click();
			}
}


