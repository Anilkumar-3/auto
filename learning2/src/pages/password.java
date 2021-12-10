package pages;

//import org.openqa.selenium.*;
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


public class password {

WebDriver driver1 ;

public password(WebDriver driver) {
this.driver1 = driver ; }


@FindBy(how = How.ID_OR_NAME, using ="Password")
public WebElement Password ;

@FindBy(how = How.NAME, using ="button")
public WebElement SignInButton ;

public void SignInButton()
{
SignInButton.click();
}

{
System.out.println("signin successfully !");
}


public void SetTextForPassword1(String pwd )  {
Password.clear();
Password.sendKeys("PdpAdmin@123");
}
}
