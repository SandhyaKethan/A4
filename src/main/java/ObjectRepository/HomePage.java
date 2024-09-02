package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;

public class HomePage {
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leads;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;
	
	@FindBy(xpath="//a[text()='My Preferences']")
	private WebElement preferences;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPreferences() {
		return preferences;
	}
	public WebElement getSignout() {
		return signout;
	}
	
	public void clickOnLeads() {
		leads.click();	
	}
	public void clickOnOrg() {
		org.click();	
	}

	public void logoutoperation(WebDriver driver) throws Exception {
		
		SeleniumUtility SUTIL=new SeleniumUtility();
		SUTIL.moveCurserToElement(driver,preferences);
		Thread.sleep(3000);
		SUTIL.moveCurserToElement(driver,signout);
		SUTIL.ClickOnElement(driver, signout);
	}

	
		}

		
	


