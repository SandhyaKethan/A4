package tcRepository;

import org.testng.annotations.Test;

import ObjectRepository.CreateNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsHomePage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;

public class LE_02 extends BaseClass{
	@Test
	public void le_02() throws Exception{
		
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String FIRSTNAME= EUTIL.readDataFromExcel("leads",5,1);
		String LASTNAME= EUTIL.readDataFromExcel("leads",5,2);
		String COMPANY= EUTIL.readDataFromExcel("leads",5,3);
		String TITLE= EUTIL.readDataFromExcel("leads",5,4);
		String PHONE= EUTIL.readDataFromExcel("leads",5,5);
		String MOBILE= EUTIL.readDataFromExcel("leads",5,6);
		String EMAIL= EUTIL.readDataFromExcel("leads",5,7);
		String NOOFEMP= EUTIL.readDataFromExcel("leads",5,8);
		String STREET= EUTIL.readDataFromExcel("leads",5,9);
		String POBOX= EUTIL.readDataFromExcel("leads",5,10);
		String POCODE= EUTIL.readDataFromExcel("leads",5,11);
		String CITY= EUTIL.readDataFromExcel("leads",5,12);
		String COUNTRY= EUTIL.readDataFromExcel("leads",5,13);
		String STATE= EUTIL.readDataFromExcel("leads",5,14);
		

		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.CreateLead(FIRSTNAME, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMP, STREET, POBOX, POCODE, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
}
}
