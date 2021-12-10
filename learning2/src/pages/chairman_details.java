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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class chairman_details {

WebDriver driver ;

public chairman_details(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-19']")
public WebElement cname;

public void name(String name )  {
	cname.clear();
	cname.sendKeys("test chairman");
}

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-20']")
public WebElement chairmanmobile;

public void mobile(String mobile )  {
	chairmanmobile.clear();
	chairmanmobile.sendKeys("78951658468");	
	
}

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-21']")
public WebElement cemail;

public void email(String email )  {
	cemail.clear();
	cemail.sendKeys("chairman@avs.hvd");	
	 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	 // Print the Date
	 System.out.println(date1);

}



}