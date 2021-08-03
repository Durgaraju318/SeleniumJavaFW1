package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class TestNGDemo2 
{
    static WebDriver driver = null;
    @BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chrome_driver.exe");
		 driver = new ChromeDriver();
	}
@Test
public static void GoogleSearchTest() 
{

	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Automation");
	driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
}
@AfterTest
public void tearDown()
{
	
driver.close();

}

}
