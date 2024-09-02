package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
	@FindBy(xpath="//input[@name='accountname']")
private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
private WebElement webSite;
	
	@FindBy(xpath="//input[@name='employees']")
private WebElement employees;
	
	@FindBy(xpath="//input[@name='phone']")
private WebElement phn;
	
	@FindBy(xpath="//input[@name='otherphone']")
private WebElement otherPhn;
	
	@FindBy(xpath="//input[@name='email1']")
private WebElement email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement billingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")
private WebElement billingCity;
	
	@FindBy(xpath="/input[@name='bill_country']")
private WebElement billingState;
	
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
private WebElement save;
	
public CreateNewOrgPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}

public WebElement getOrgName() {
	return orgName;
}

public WebElement getWebSite() {
	return webSite;
}

public WebElement getEmployees() {
	return employees;
}

public WebElement getPhn() {
	return phn;
}

public WebElement getOtherPhn() {
	return otherPhn;
}

public WebElement getEmail() {
	return email;
}

public WebElement getBillingAddress() {
	return billingAddress;
}

public WebElement getBillingCity() {
	return billingCity;
}

public WebElement getBillingState() {
	return billingState;
}
public WebElement getSave() {
	return save;
}
public void CreateOrganisation(String organisationName ,String Web,String Emp)
{
	orgName.sendKeys(organisationName);
	webSite.sendKeys(Web);
	employees.sendKeys(Emp);
	save.click();

	
}
public void CreateOrganisation(String organisationName ,String Web,String Emp,String phoneNumber,String otherPhone,
		String mailId)
{
	orgName.sendKeys(organisationName);
	webSite.sendKeys(Web);
	employees.sendKeys(Emp);
	phn.sendKeys(phoneNumber);
	otherPhn.sendKeys(otherPhone);
	email.sendKeys(mailId);
	save.click();

}
public void CreateOrganisation(String organisationName ,String Web,String billAd,String billCity,String billState)
{
	orgName.sendKeys(organisationName);
	webSite.sendKeys(Web);
	billingAddress.sendKeys(billAd);
	billingCity.sendKeys(billCity);
	billingState.sendKeys(billState);
	save.click();

}
public void CreateOrganisation(String organisationName ,String Web,String Emp,String phoneNumber,String otherPhone,
		String mailId,String billAd,String billCity,String billState)
{
	orgName.sendKeys(organisationName);
	webSite.sendKeys(Web);
	employees.sendKeys(Emp);
	phn.sendKeys(phoneNumber);
	otherPhn.sendKeys(otherPhone);
	email.sendKeys(mailId);
	billingAddress.sendKeys(billAd);
	billingCity.sendKeys(billCity);
	billingState.sendKeys(billState);
	save.click();

   

}



}

















