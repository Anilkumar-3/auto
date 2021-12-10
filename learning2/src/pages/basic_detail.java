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


public class basic_detail {

WebDriver driver ;

public basic_detail(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.ID_OR_NAME, using ="mat-input-7")
public WebElement clientcode;

public void clientcode(String ccode )  {
	clientcode.clear();
	clientcode.sendKeys("789454535665434");
}


@FindBy(how = How.ID_OR_NAME, using ="mat-input-8")
public WebElement clientname ;

public void clientname(String cname )  {
	clientname.clear();
	clientname.sendKeys("auto1");
}

@FindBy(how = How.ID_OR_NAME, using ="mat-input-9")
public WebElement centercode ;



public void centercode(String Ccode )  {
	centercode.clear();
	centercode.sendKeys("123456564");
}


@FindBy(how = How.ID_OR_NAME, using ="mat-input-10")
public WebElement shortname ;



public void shortname(String sname )  {
	shortname.clear();
	shortname.sendKeys("auto1");
}

@FindBy(how = How.XPATH, using="//*[@id=\"mat-select-11\"]/div/div[1]/span")
public WebElement hierarchy ;

@FindBy(how = How.XPATH, using="//span[contains(text(),'VDCS')]")
public WebElement type ;

public void hierechy( )  {
	hierarchy.click();
}
public void type()
{
	type.click();
	}

@FindBy(how = How.CSS, using="#mat-select-13 > div > div.mat-select-value.ng-tns-c95-38")
public WebElement status ;

@FindBy(how = How.XPATH, using="//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
public WebElement type1 ;

public void status( )  {
	status.click();
}
public void type1()
{
	type1.click();
	}

}