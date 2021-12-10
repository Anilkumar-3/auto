package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.lang.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class dropdown {
	WebDriver driver ;

	public dropdown(WebDriver driver) {
	this.driver = driver; 
	
	
	// driver.findElement(By.cssSelector("#mat-select-1 > div > div.mat-select-value.ng-tns-c95-3 > span > span")).click();
	  //  driver.findElement(By.cssSelector("#mat-option-48 .ml-3")).click();
	}
	@FindBy(how = How.XPATH, using="//div[@class='mat-select-value ng-tns-c124-3']")
	public WebElement dropdown ;

	public void selectdropdown( ) 
	{
		dropdown.click();
	}
	@FindBy(how = How.CSS, using="#mat-option-49 .ml-3")
	public WebElement dropdownlist ;

	public void dropdownlist( ) 
	{
		dropdownlist.click();
	}
	@FindBy(how = How.CSS, using="#mat-select-1 > div > div.mat-select-value.ng-tns-c95-3 > span > span")
	public WebElement dropdown1 ;

	public void selectdropdown1( ) 
	{
		dropdown1.click();
	}
	@FindBy(how = How.CSS, using="#mat-option-49 > span > div > span")
	public WebElement dropdownlist1 ;

	public void dropdownlist1( ) 
	{
		dropdownlist1.click();
	}
}
