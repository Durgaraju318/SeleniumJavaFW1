package Demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
class TestNGGroupsDemo 

{

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("This is test 1");
		
	}
	
	@Test(groups = {"windows.regression"})
	
	public void test2()
	{
		System.out.println("This is test 2");
		
	}
	
	@Test(groups = {"linux.regression"})
	public void test3()
	{
		System.out.println("This is test 3");
		
	}
	
	public void test4()
	{
		System.out.println("This is test 4");
		
	}
	
	
	
	
}
