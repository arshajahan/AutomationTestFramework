package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtils driverUtils = new WebDriverUtils();
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setup(String browser) throws IOException {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else
		{ 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	
		driver.get(pdata.getData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		
		if(status == 2) {
			CaptureScreenshot ss = new CaptureScreenshot();
			ss.getPhoto(driver, name);
		}
		driver.quit();
	}

}
