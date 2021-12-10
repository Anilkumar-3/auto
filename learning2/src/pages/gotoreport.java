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


public class gotoreport {
	WebDriver driver ;

	public gotoreport(WebDriver driver) {
	this.driver = driver ; 
	
	//driver.findElement(By.linkText("Reports")).click();
	//driver.findElement(By.xpath("//a[normalize-space()='Error Logs']")).click();
	//driver.findElement(By.linkText("Clients")).click();
	//driver.findElement(By.linkText("Client")).click();
	}
public void naverrorreport()

	{
	driver.findElement(By.linkText("Reports")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Error Logs']")).click();
		System.out.println("error report");
		
	}
public void navcleaningreport()
{
	driver.findElement(By.linkText("Reports")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Cleaning Logs']")).click();
		System.out.println("cleaning report");
	}
public void navcalibrationhistory()
{
	driver.findElement(By.linkText("Reports")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Calibration History']")).click();
		System.out.println("calibration history");
	}
	}
	
