package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class MyMainPage extends BasePage{

	By fullNameFieldLocator = By.xpath("//input[@id='form-field-field_1']");
	By emailFieldLocator = By.xpath("//input[@name='form_fields[email]']");
	By submitButtonLoctor = By.xpath("(//span[@class='elementor-button-text'])[2]");

	public MyMainPage(WebDriver driver) {
		super(driver);
	}


	public void signUpForSales() {

		try {
			WebElement fullNameField =driver.findElement(fullNameFieldLocator);
			fullNameField.sendKeys("sara levi");
			Thread.sleep(1000);
			WebElement emailField =driver.findElement(emailFieldLocator);
			emailField.sendKeys("saralevi@gmail.com");
			Thread.sleep(1000);
			WebElement submitButton =driver.findElement(submitButtonLoctor);
			submitButton.click();
			verifyElementClickabke(submitButtonLoctor);
			Thread.sleep(4000);
			Reporter.reportStep(ReporterStatus.INFO, "client filled full name and mail and signed up for sales successfuly");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Reporter.reportStep(ReporterStatus.FAIL, "Client didn't successeed to signed up for sales successfuly");
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");
            e.printStackTrace();
		}

	}
}
