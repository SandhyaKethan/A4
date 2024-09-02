package Sample;

import org.testng.annotations.Test;
//@Test
public class sample3 {
	@Test(priority = 0)
public void createUser()
{
	System.out.println("user created!!");
}
	@Test(priority = 1)
public void modifyUser()
{
	System.out.println("user modified!!");
}
@Test(priority = -1)
public void deleteUser()
{
	System.out.println("user deleted!!");
}
}
