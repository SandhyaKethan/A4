package tcRepository;

import org.testng.annotations.Test;

import ObjectRepository.CreateNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsHomePage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;

public class LE_03 extends BaseClass{
	@Test
public void le_03() throws Exception {
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String FIRSTNAME= EUTIL.readDataFromExcel("leads",8,1);
		String LASTNAME= EUTIL.readDataFromExcel("leads",8,2);
		String COMPANY= EUTIL.readDataFromExcel("leads",8,3);
		String TITLE= EUTIL.readDataFromExcel("leads",8,4);
		String PHONE= EUTIL.readDataFromExcel("leads",8,5);
		String MOBILE= EUTIL.readDataFromExcel("leads",8,6);
		String EMAIL= EUTIL.readDataFromExcel("leads",8,7);
		String NOOFEMP= EUTIL.readDataFromExcel("leads",8,8);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
        cn.CreateLead(FIRSTNAME, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMP);
        Thread.sleep(4000);
}
}
