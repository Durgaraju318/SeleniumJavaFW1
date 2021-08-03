import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserTest 

{
	public static void main(String[] args) {
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("projectPath : " +projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodrivers\\geckodriver.exe");  
		//WebDriver driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chrome_driver.exe");
		//WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEdriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		//driver.get("http://selenium.dev/");
		//driver.close();
		/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		//driver.quit();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
