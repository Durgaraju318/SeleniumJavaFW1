import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEdriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		
		
	}

}
