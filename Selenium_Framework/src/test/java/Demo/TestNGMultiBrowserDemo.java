package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo 

{
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");


@Parameters("browserName")
@BeforeTest
public void setUp(String browserName)
{
	System.out.println("Browser Name is :" +browserName);
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chrome_driver.exe");
		driver = new ChromeDriver();

	}else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodrivers\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		
	}
		
}

@Test
public void test1() throws Exception
{
	driver.get("https://google.com");
	Thread.sleep(4000);
}


public void tearDown()
{
	driver.close();
	System.out.println("The test completed successfully");
}
}
