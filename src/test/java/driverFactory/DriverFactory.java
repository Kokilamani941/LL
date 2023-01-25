package driverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Loggerload;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public WebDriver initializeDrivers(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			Loggerload.info("Testing on firefox");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			Loggerload.info("Testing on chrome");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			Loggerload.info("Testing on safari");
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
						
		}
		else if(browser.equalsIgnoreCase("edge")) {
			Loggerload.info("Testing on edge");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
	     // driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		return driver;
		
	}
public static WebDriver getdriver() {
	
	return driver;
}
public void closeallDriver() {
	driver.close();
}
}
