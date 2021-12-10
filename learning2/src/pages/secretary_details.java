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


public class secretary_details {

WebDriver driver ;

public secretary_details(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-17']")
public WebElement name;

public void name(String sname )  {
	name.clear();
	name.sendKeys("test secretary");
}

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-18']")
public WebElement mobile;

public void mobile(String smobile )  {
	mobile.clear();
	mobile.sendKeys("78951658468");
	
	
	
}



}