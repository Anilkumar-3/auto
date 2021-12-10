package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.*;
import java.lang.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class address_details {

WebDriver driver ;

public address_details(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-11']")
public WebElement pincode;

public void pincode(String pcode )  {
	pincode.clear();
	pincode.sendKeys("380080");
}


@FindBy(how = How.XPATH, using ="//span[contains(text(),'State')]")
public WebElement state ;

public void state()   {
	state.click();
	
}

@FindBy(how = How.XPATH, using ="//span[contains(text(),'Gujarat')]")
public WebElement statename ;



public void statename( )  {
	statename.click();
}


@FindBy(how = How.XPATH, using ="//mat-tab-body/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]")
public WebElement district ;



public void district()  {
	district.click();
}

@FindBy(how = How.XPATH, using="//span[contains(text(),'Ahmedabad District')]")
public WebElement selectdistrict ;



public void selectdistrict( )  {
	selectdistrict.click();
}

@FindBy(how = How.XPATH, using="//span[contains(text(),'Sub District')]")
public WebElement subdistrict ;
public void subdistrict()
{
	subdistrict.click();
	}

@FindBy(how = How.XPATH, using="//span[contains(text(),'Ahmedabad SubDistrict')]")
public WebElement selectsubdistrict ;



public void selectsubdistrict( )  {
	selectsubdistrict.click();
}

@FindBy(how = How.XPATH, using="//span[contains(text(),'Village')]")
public WebElement village ;
public void village()
{
	village.click();
	}


@FindBy(how = How.XPATH, using="//span[contains(text(),'Ahmedabad Village')]")
public WebElement selectvillage ;
public void selectvillage()
{
	selectvillage.click();
	}
@FindBy(how = How.XPATH, using ="//input[@id='mat-input-12']")
public WebElement address;

public void address(String add )  {
	address.clear();
	address.sendKeys("maurya square");
}




}