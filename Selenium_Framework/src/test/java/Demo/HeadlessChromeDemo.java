package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo 
{
	
	
	
	public static void main(String[] args) {
		test();
	}

	public static void test() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\sj_demo\\Selenium_Framework\\drivers\\chromedriver\\chromedriver.exe");
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	
	ChromeDriver driver = new ChromeDriver(options);
	
	
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("Automation");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	
	driver.close();
	driver.quit();
	System.out.println("completed");
	}
}
