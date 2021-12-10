package test_cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
/*import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;*/
import java.io.*;




import pages.*;

public class signin {
 public static WebDriver driver = null  ;
 /*
 XSSFWorkbook workbook ;
 XSSFSheet sheet ;
 XSSFCell cell ;
 File src ;
 FileInputStream fis ;
 */
 
 /***********Adding Username **********/

  @Test
  public void Username() {
 
 /*************Add Username***************/
 
 username username = PageFactory.initElements(driver, username.class);
 String uname = "";
 /*
 for (int i = 2; i<=sheet.getLastRowNum();i++) {
cell = sheet.getRow(i).getCell(0);
cell.setCellType(CellType.STRING);
user = cell.getStringCellValue();
cell = sheet.getRow(i).getCell(0);
cell.setCellType(CellType.STRING);
pwd = cell.getStringCellValue();*/
username.SetTextForUsername(uname);
username.nextButton();  

/*************Add Password***************/

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
password password = PageFactory.initElements(driver, password.class);
//String pwd = "";
password.SetTextForPassword1("PdpAdmin@123");
password.SignInButton(); 

/*************change society***************/

//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//dropdown dropdown = PageFactory.initElements(driver, dropdown.class);
//dropdown.selectdropdown();
//dropdown.dropdownlist();
//dropdown.selectdropdown1();
//dropdown.dropdownlist1();
/*************goto client***************/



driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
create_client navclient = PageFactory.initElements(driver, create_client.class);
navclient.navclient();

/*************goto add client***************/


driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
add_client addclient = PageFactory.initElements(driver, add_client.class);

addclient.ClickOnAddButton(); 

/*************add client basic  details***************/
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
basic_detail basicdetail = PageFactory.initElements(driver, basic_detail.class);

String ccode = "";
basicdetail.clientcode(ccode);
String cname = "";
basicdetail.clientname(cname);
String Ccode = "";
basicdetail.centercode(Ccode);
String sname = "";
basicdetail.shortname(sname);

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
basicdetail.hierechy();
basicdetail.type();
//basicdetail.status();
//basicdetail.type1();

/*************add address  details***************/

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
address_details address_details = PageFactory.initElements(driver, address_details.class);

String pcode = "";
address_details.pincode(pcode);


driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
address_details.state();
address_details.statename();
address_details.district();
address_details.selectdistrict();
address_details.subdistrict();
address_details.selectsubdistrict();
address_details.village();
address_details.selectvillage();
String add = "";
address_details.address(add);

/*************add contact  details***************/

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
contact_details contact_details = PageFactory.initElements(driver, contact_details.class);

String mnum = "";
contact_details.mobile(mnum);

String address = "";
contact_details.email(address);

/*************add registration  details***************/

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
registraton_details registraton_details = PageFactory.initElements(driver, registraton_details.class);

String rnum = "";
registraton_details.registration_number(rnum);

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
registraton_details.rdate();
registraton_details.rdate1();

/*************add secretary  details***************/

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
secretary_details secretary_details = PageFactory.initElements(driver, secretary_details.class);

String sname1 = "";
secretary_details.name(sname1);

String smobile = "";
secretary_details.mobile(smobile);

/*************add secretary  details***************/

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
chairman_details chairman_details = PageFactory.initElements(driver, chairman_details.class);

String name = "";
chairman_details.name(name);
String mobile = "";
chairman_details.mobile(mobile);
String email = "";
chairman_details.email(email);

  }
  
 
 


  @BeforeSuite
  public void beforeSuite() {
	  
 try {
	 /*
  src = new File("E:\\Softwares\\TestData.xlsx");
  fis = new FileInputStream(src);
  workbook = new XSSFWorkbook(fis);
  sheet = workbook.getSheetAt(0);
    cell = sheet.getRow(0).getCell(0);
    cell.setCellType(CellType.STRING);
  String URL = "";
  URL = cell.getStringCellValue() ;
  */
  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prompt\\\\Desktop\\\\anil\\\\chromedriver.exe");
  ChromeOptions chromeOptions = new ChromeOptions();
  chromeOptions.addArguments("--start-maximized");
  driver = new ChromeDriver(chromeOptions);
  driver.get("https://milkpro.in/");
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
/*  try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
*/
 }
 catch (Exception ex)
 {
 System.out.println("test :" + ex.getMessage());
 }

  }

  @AfterSuite
  public void afterSuite() {
 /*try {
 //fis.close();
 //AdminPageTest.driver.quit();
 }
 catch (Exception ex)
 
 {
 
 }*/
}
}