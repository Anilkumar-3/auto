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


public class create_client {
	WebDriver driver ;

	public create_client(WebDriver driver) {
	this.driver = driver ; 
	
	driver.findElement(By.linkText("Clients")).click();
	driver.findElement(By.cssSelector(".mat-typography")).click();
	driver.findElement(By.linkText("Clients")).click();
	driver.findElement(By.linkText("Client")).click();
	}
public void navclient()

	{
		System.out.println("Client");
		}
	}
	

