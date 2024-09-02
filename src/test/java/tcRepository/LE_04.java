package tcRepository;

import ObjectRepository.CreateNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsHomePage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;

public class LE_04 extends BaseClass{
public void le_o4() throws Exception {
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String FIRSTNAME= EUTIL.readDataFromExcel("leads",11,1);
		String LASTNAME= EUTIL.readDataFromExcel("leads",11,2);
		String COMPANY= EUTIL.readDataFromExcel("leads",11,3);
		String STREET= EUTIL.readDataFromExcel("leads",11,4);
		String POBOX= EUTIL.readDataFromExcel("leads",11,5);
		String POCODE= EUTIL.readDataFromExcel("leads",11,6);
		String CITY= EUTIL.readDataFromExcel("leads",11,7);
		String COUNTRY= EUTIL.readDataFromExcel("leads",11,8);
		String STATE= EUTIL.readDataFromExcel("leads",11,9);
		

		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.CreateLead(FIRSTNAME, LASTNAME, COMPANY, STREET, POBOX, POCODE, CITY, COUNTRY, STATE);
}
}
