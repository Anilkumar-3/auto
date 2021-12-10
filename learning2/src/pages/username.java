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


public class username {

WebDriver driver ;

public username(WebDriver driver) {
this.driver = driver ; }

@FindBy(how = How.ID_OR_NAME, using ="Username")
public WebElement username ;


@FindBy(how = How.NAME , using ="button")
public WebElement nextButton ;
public void nextButton()
{
nextButton.click();
}

{
System.out.println("Username added successfully !");
}

public void ClickOnSignInButton()
{
nextButton.click();
}

{
System.out.println("Username added");
}

public void SetTextForUsername(String uname )  {
username.clear();
username.sendKeys("admin");
}
}