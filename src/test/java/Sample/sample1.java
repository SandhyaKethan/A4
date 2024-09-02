package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class sample1 {
	@Test
public void createUser()

{
	System.out.println("user created!!");
}
//@Test
//@Test(invocationCount = 0)
	@Test(enabled = false)
public void modifyUser()
{
	System.out.println("user modified!!");
}
@Test 
@Ignore
public void deleteUser()
{
	System.out.println("user deleted");
}
}
