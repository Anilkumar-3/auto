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


public class registraton_details {

WebDriver driver ;

public registraton_details(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.XPATH, using ="//input[@id='mat-input-15']")
public WebElement registration_number;

public void registration_number(String rnum )  {
	registration_number.clear();
	registration_number.sendKeys("324814");
}

@FindBy(how = How.XPATH, using ="//mat-tab-body/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
public WebElement rdate;

public void rdate( )  {
	rdate.click();
		
}
@FindBy(how = How.XPATH, using ="//body[1]/div[2]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]")
public WebElement rdate1;


public void rdate1( )  {
	rdate1.click();

	
	
}


}