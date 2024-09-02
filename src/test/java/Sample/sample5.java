package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample5 {
	@Test
public void softAssertStrictComparision() {
	String expectedData="raja";
	String actualData="Raja";
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actualData,expectedData);
	System.out.println(" soft assert strict level comparision pass");
sa.assertAll();
}
	@Test
public void SoftAssertContainsLevelComparision() {
	String expectedData="raja";
	String actualData="maharaja";
	SoftAssert sa=new SoftAssert();
	sa.assertTrue(actualData.contains(expectedData));
	System.out.println("soft assert contains level comparision pass");
	sa.assertAll();
	
}

}
