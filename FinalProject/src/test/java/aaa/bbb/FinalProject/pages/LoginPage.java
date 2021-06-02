package aaa.bbb.FinalProject.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class LoginPage extends BasePage{


	By connectButtonLocator = By.xpath("(//span[@class='jet-auth-links__item-text'])[1]");
	By nameFieldLocator = By.xpath("//input[@id='user']");
	By emailFieldLoginLocator = By.xpath("//input[@id='password']");
	By submitButtonLocator = By.xpath("//button[@name='uael-login-submit']");
	By welcomeButtonLocator = By.xpath("//div[@class='jet-switcher__control-handler']");
	By firstNameButtonLocator= By.xpath("//input[@name='first_name']");
	By lastNameButtonnLocator = By.xpath("//input[@name='last_name']");
	By emailFieldSignUpLocator = By.xpath("//input[@name='email']");
	By passwordButtonLocator= By.xpath("//input[@class='elementor-field elementor-size-sm form-field-password elementor-field-textual']");
	By confirmPasswordButtonLocator= By.xpath("//button[@class='elementor-button uael-register-submit elementor-size-sm']");
	By searchFieldLocator = By.name("q");


	public void login() {
		try {
			WebElement connectButton= driver.findElement(connectButtonLocator);
			connectButton.click();
			WebElement nameField= driver.findElement(nameFieldLocator);
			nameField.sendKeys("rtyiyui@yahoo.com");
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			WebElement emailField= driver.findElement(emailFieldLoginLocator);
			emailField.sendKeys("A123a4494");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement submitButton = driver.findElement(submitButtonLocator);
			submitButton.click();
			verifyElementClickabke(submitButtonLocator);
			Reporter.reportStep(ReporterStatus.PASS, "Client execute login to online supermarket");

		} catch (Exception e) {
			// TODO: handle exception
			Reporter.reportStep(ReporterStatus.FAIL, "Client didn't successeed to execute login to online supermarket");
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");

		}


	}


	
	public void signUp() {

		try {
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			WebElement connectionButton= driver.findElement(connectButtonLocator);
			connectionButton.click();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			WebElement welcomeButton= driver.findElement(welcomeButtonLocator);
			welcomeButton.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


			WebElement firstNameButton = driver.findElement(firstNameButtonLocator);
			firstNameButton.sendKeys("gershon");

			WebElement lastNameButtonn = driver.findElement(lastNameButtonnLocator);
			lastNameButtonn.sendKeys("Levi");

			WebElement emailField = driver.findElement(emailFieldSignUpLocator);
			emailField.sendKeys("rtyiyui@yahoo.com");

			WebElement passwordButton = driver.findElement(passwordButtonLocator);
			passwordButton.sendKeys("A123a4494");

			WebElement confirmPassButton = driver.findElement(By.xpath("//input[@name='confirm_pass']"));
			confirmPassButton.sendKeys("A123a4494");
			Reporter.reportStep(ReporterStatus.INFO, "Customer filled the detailes for signup to the online market ");

			WebElement signUpbtn = driver.findElement(confirmPasswordButtonLocator);
			signUpbtn.click();

		} catch (Exception e) {
			// TODO: handle exception
			Reporter.reportStep(ReporterStatus.FAIL, "Customer didn't successeed to fill the detailes for sign up to the online market");
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");
		}


	}



	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void search(String value) {

		try {
			WebElement searchField = driver.findElement(searchFieldLocator);
			searchField.sendKeys(value);
		} catch (Exception e) {
			// TODO: handle exception
		}


	}


}