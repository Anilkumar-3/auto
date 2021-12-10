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


public class add_client {

WebDriver driver ;

public add_client(WebDriver driver) {
this.driver = driver ; 


}
@FindBy(how = How.XPATH, using ="//button[@class='btn btn-save ml-2 btn-desktop ng-star-inserted']")
public WebElement addButton ;

public void ClickOnAddButton()
{
addButton.click();
}
}