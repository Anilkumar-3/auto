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


public class contact_details {

WebDriver driver ;

public contact_details(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-13']")
public WebElement mobile;

public void mobile(String mnum )  {
	mobile.clear();
	mobile.sendKeys("7895418676546");
}

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-14']")
public WebElement email;

public void email(String address )  {
	email.clear();
	email.sendKeys("auto1@xyz.com");
	
	
	
	
}




}