package Demo;

import org.testng.annotations.Test;

public class TestNGDependenyDemo 
{
	@Test(dependsOnGroups = {"sanity1.*"})
	public void test1() 
	{
		System.out.println("I am in Test1");
	}
	@Test(groups = {"sanity1"})
	public void test2() 
	{
		System.out.println("I am in Test2");
	}
	@Test(groups = {"sanity1"})
	public void test3() 
	{
		System.out.println("I am in Test3");
	}

}
