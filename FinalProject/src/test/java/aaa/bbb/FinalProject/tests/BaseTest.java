package aaa.bbb.FinalProject.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		
		
		
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		
		
		
		
	}

	@BeforeClass(alwaysRun = true)
	
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dvora\\colors\\UpdateChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://pekan770.co.il/?gclid=CjwKCAjwtJ2FBhAuEiwAIKu19hdaTyiC5zpPLn8P0WUrg8j0wW8wOa-JCyTdhei2KtMr4a4nAwst4hoC91gQAvD_BwE");

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {

		driver.quit();
		
	}
	
	

}
