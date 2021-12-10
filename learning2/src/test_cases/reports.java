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

public class reports {
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

/*************goto error report***************/


driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
gotoreport gotoreport = PageFactory.initElements(driver, gotoreport.class);



/*************search error report***************/


gotoreport.naverrorreport();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
searcherror searcherror = PageFactory.initElements(driver, searcherror.class);


String from_client = "";

searcherror.fromclient(from_client);

String to_client = "";

searcherror.toclient(to_client);
searcherror.devicetype();
searcherror.selectdevicetype();


searcherror.sdate();

searcherror.prevmonth();
searcherror.prevmonth();
searcherror.prevmonth();
searcherror.prevmonth();
searcherror.prevmonth();
searcherror.selectsdate();


searcherror.edate();
searcherror.selectedate();

searcherror.search();
searcherror.excel();

/*************search cleaning report***************/

gotoreport.navcleaningreport();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
cleaningdetails cleaningdetails = PageFactory.initElements(driver, cleaningdetails.class);

String from_client1 = "";

cleaningdetails.fromclient(from_client1);

String to_client1 = "";

cleaningdetails.toclient(to_client1);
cleaningdetails.devicetype();
cleaningdetails.selectdevicetype();

cleaningdetails.edate1();
cleaningdetails.selectedate1();
cleaningdetails.sdate1();
cleaningdetails.prevmonth();
cleaningdetails.prevmonth();
cleaningdetails.prevmonth();
cleaningdetails.prevmonth();
cleaningdetails.prevmonth();
cleaningdetails.selectsdate1();




cleaningdetails.search();
cleaningdetails.excel();


/*************search calibration history***************/

gotoreport.navcalibrationhistory();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
calibrationhistory calibrationhistory = PageFactory.initElements(driver, calibrationhistory.class);

calibrationhistory.edate();
calibrationhistory.selectedate();

calibrationhistory.sdate();
calibrationhistory.selectsdate();


calibrationhistory.devicetype();
calibrationhistory.selectdevicetype();
//calibrationhistory.status();
//calibrationhistory.statustype();
String from_client2 = "";

calibrationhistory.fromclient(from_client2);

String to_client2 = "";

calibrationhistory.toclient(to_client2);
calibrationhistory.search();
calibrationhistory.excel();





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
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\anil.patva\\Desktop\\anil\\selenium web driver\\chromedriver.exe");
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