package Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Google_Search_Pages;


public class GoogleSearchTest 
{
	private static WebDriver driver = null;
	public static void main(String[] args) {

		Google_Search_Pages();

	} 
	public static void googlesearchtest() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chrome_driver.exe");
		driver = new ChromeDriver();

		driver.get("https://google.com");
		Google_Search.textbox_search(driver).sendKeys("Automation step by step");
		Google_Search.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();



	}
}
