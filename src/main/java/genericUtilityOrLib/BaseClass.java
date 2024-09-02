package genericUtilityOrLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public  class BaseClass {
 public static WebDriver driver=null;
SeleniumUtility SUTIL=null;
PropertiesUtil PUTIL=new PropertiesUtil();

@BeforeSuite(alwaysRun=true)
public void CreateConnection() {
	System.out.println(" CreateConnection sucessful");
}

@BeforeClass(alwaysRun=true)
public void lanchBrowser() throws Exception {
String URL=PUTIL.getDataFromProperties("url");
SUTIL=new SeleniumUtility();
driver=new ChromeDriver();
SUTIL.implicitWait(driver, 10);
SUTIL.maximizeWindow(driver);
driver.get(URL);
System.out.println("lanching sucessfuly!!");
}

@BeforeMethod(alwaysRun=true)
public void loginApp() throws Exception {
String USERNAME=PUTIL.getDataFromProperties("username");
String PASSWORD=PUTIL.getDataFromProperties("password");
LoginPage lp=new LoginPage(driver);
lp.loginoperation(USERNAME, PASSWORD);
System.out.println("login sucessful!!");
}

@AfterMethod(alwaysRun=true)
public void logout() throws Exception {
	HomePage hp=new HomePage(driver);
	hp.logoutoperation(driver);
	System.out.println("logout sucesful!!");
}
@AfterClass(alwaysRun=true)
public void close() {
		driver.close();
		System.out.println("Broswer close sucessfuly");
		}
@AfterSuite(alwaysRun=true)
public void CloseConnection() {
	System.out.println("connection close successfuly");
}
	
}
