package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
public WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
public WebElement LastName;

	@FindBy(xpath="//input[@name='company']")
public WebElement Company;


	@FindBy(xpath="//input[@name='designation']")
public WebElement Title;

	@FindBy(xpath="//input[@name='phone']")
public WebElement Phone;

	@FindBy(xpath="//input[@name='mobile']")
	public WebElement Mobile;

	@FindBy(xpath="//input[@name='email']")
	public WebElement Email;

	@FindBy(xpath="//input[@name='noofemployees']")
	public WebElement NoOfEmplotees;

	@FindBy(xpath="//textarea[@name='lane']")
	public WebElement Street;

	@FindBy(xpath="//input[@name='pobox']")
	public WebElement PoBox;
	
	@FindBy(xpath="//input[@name='code']")
	public WebElement PostalCode;
	@FindBy(xpath="//input[@name='city']")
	public WebElement City;

	@FindBy(xpath="//input[@name='country']")
	public WebElement Country;

	@FindBy(xpath="//input[@name='state']")
	public WebElement State;
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	public WebElement Save;
	

public CreateNewLeadPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public WebElement getFirstName() {
	return FirstName;
}


public WebElement getLastName() {
	return LastName;
}


public WebElement getCompany() {
	return Company;
}


public WebElement getTitle() {
	return Title;
}


public WebElement getPhone() {
	return Phone;
}


public WebElement getMobile() {
	return Mobile;
}


public WebElement getEmail() {
	return Email;
}


public WebElement getNoOfEmplotees() {
	return NoOfEmplotees;
}


public WebElement getStreet() {
	return Street;
}


public WebElement getPoBox() {
	return PoBox;
}


public WebElement getPostalCode() {
	return PostalCode;
}


public WebElement getCity() {
	return City;
}


public WebElement getCountry() {
	return Country;
}


public WebElement getState() {
	return State;
}


public WebElement getSave() {
	return Save;
}
public void CreateLead(String fname,String lname,String comp)
{
	FirstName.sendKeys(fname);
	LastName.sendKeys(lname);
	Company.sendKeys(comp);
	Save.click();
}

public void CreateLead(String fname,String lname,String comp,String title,String phone,String cont,String mail,
		String noOFEmp,String Address,String pbox,String code,String cities,String Countr,String states)
{
	FirstName.sendKeys(fname);
	LastName.sendKeys(lname);
	Company.sendKeys(comp);
	Title.sendKeys(title);
	Phone.sendKeys(phone);
	Mobile.sendKeys(cont);
	Email.sendKeys(mail);
	NoOfEmplotees.sendKeys(noOFEmp);
	Street.sendKeys(Address);
	PoBox.sendKeys(pbox);
	PostalCode.sendKeys(code);
	City.sendKeys(cities);
	Country.sendKeys(Countr);
	State.sendKeys(states);
	Save.click();
	
}
public void CreateLead(String fname,String lname,String comp,String title,String phone,String cont,String mail,
String noOFEmp)
{
	FirstName.sendKeys(fname);
	LastName.sendKeys(lname);
	Company.sendKeys(comp);
	Title.sendKeys(title);
	Phone.sendKeys(phone);
	Mobile.sendKeys(cont);
	Email.sendKeys(mail);
	NoOfEmplotees.sendKeys(noOFEmp);
	Save.click();

}
public void CreateLead(String fname,String lname,String comp,String Address,String pbox,String code,String cities,String Countr,String states)
{
	FirstName.sendKeys(fname);
	LastName.sendKeys(lname);
	Company.sendKeys(comp);
	Street.sendKeys(Address);
	PoBox.sendKeys(pbox);
	PostalCode.sendKeys(code);
	City.sendKeys(cities);
	Country.sendKeys(Countr);
	State.sendKeys(states);
	Save.click();
	
}








}
