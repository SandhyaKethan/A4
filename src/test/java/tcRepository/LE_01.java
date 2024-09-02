package tcRepository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.CreateNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsHomePage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import genericUtilityOrLib.ListenersImplementationClass;
@Listeners( ListenersImplementationClass.class)
public class LE_01 extends BaseClass {
@Test(retryAnalyzer=genericUtilityOrLib.RetryAnalyzerImplementationClass.class)
public void le_01() throws Exception {
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String FIRSTNAME= EUTIL.readDataFromExcel("Leads",2,1);
		String LASTNAME= EUTIL.readDataFromExcel("Leads",2,2);
		String COMPANY= EUTIL.readDataFromExcel("Leads",2,3);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.CreateLead(FIRSTNAME, LASTNAME, COMPANY);
		Thread.sleep(3000);
				
}
}
