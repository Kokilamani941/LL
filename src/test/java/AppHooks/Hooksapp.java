package AppHooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.Loggerload;


public class Hooksapp {
	
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	static Scenario scenario;
	
	@BeforeAll
	public static void before() throws Throwable{
		
	
	Loggerload.info("loading config file");
	ConfigReader.loadConfig();
	
	String browser=ConfigReader.getBrowserType();
	
	driverfactory = new DriverFactory();
	driver = driverfactory.initializeDrivers(browser);
	Loggerload.info("Initializing driver for : "+browser);
	}	
	
	@Before
	public void scenario(Scenario scenario) {
		Loggerload.info("===============================================================================================");
		Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		Loggerload.info("-----------------------------------------------------------------------------------------------");
	}
	
	@AfterStep
	public void afterstep(Scenario scenario) {
		if(scenario.isFailed()) {
			Loggerload.error("steps failed,taking screenshots");
			final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot ,"image/png","My Screenshot");
		//	Allure.addAttachment("Myscreenshot",
				//	new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
	}
	@AfterAll
	public static void after() {
		Loggerload.info("Closing Driver");
		driverfactory.closeallDriver();
	}
}
