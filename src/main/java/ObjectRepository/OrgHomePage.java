package ObjectRepository;

import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.Preferences;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;
/**
 * this is the pom class for orgHomePage
 */
public class OrgHomePage {
	@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement newOrgBtn;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getCreateNewOrgBtn() {
		return newOrgBtn;
		}
/**
 * business lib to click on new org Btn
 */
	public void clickOnNewOrgBtn()
	{
		newOrgBtn.click();
	}
		
}
