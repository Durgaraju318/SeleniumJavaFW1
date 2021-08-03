package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest 
{
	private static WebDriver driver = null;
public static void main(String[] args) 
{

 GoogleSearchTest();
}
public static void GoogleSearchTest() 
{

	String projectPath = System.getProperty("user.dir");
	System.out.println("projectPath : " +projectPath);

	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chrome_driver.exe");
	driver = new ChromeDriver();
	
	GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
	
	driver.get("htpps://google.com");
	searchPageObj.setTextInSearchBox(" A B C D");
	searchPageObj.clickSearchButton();
	driver.close();
		
}
}
