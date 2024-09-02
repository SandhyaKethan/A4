package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Sample4 {
public void hardAssertStrictComparision() {
	String expectedData="raja";
	String actualData="Raja";
	Assert.assertEquals(actualData,expectedData);
	System.out.println("Strict comparision Pass");
}
@Test
public void hardAssertContainsLevelComparision() {
	String expectedData="raja";
	String actualData="maharaja";
	Assert.assertTrue(actualData.contains(expectedData));
	System.out.println("contains level comparision passs");
}
}
