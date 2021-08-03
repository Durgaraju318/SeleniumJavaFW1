package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparamentersDemo 
{
@Test
	@Parameters({"MyName"})
public void test(@Optional("Durga") String name)
	{
	
	System.out.println("Name is:"+name);
	}
	
}
