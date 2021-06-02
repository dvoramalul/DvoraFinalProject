package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class ContactUsPage extends BasePage {

	By contactUsButtonLocator = By.xpath("(//span[@class='jet-nav-link-text'])[3]");
	By fullNameFieldLocator = By.xpath("//input[@id='form-field-name']");
	By emailFieldLocator =  By.xpath("(//input[@name='form_fields[email]'])[1]");
	By sendButtonLocator = By.xpath("//i[@class='fas fa-angle-double-left']");
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	public void contactUs() {

		try {
			WebElement contactUsButton = driver.findElement(contactUsButtonLocator);
			contactUsButton.click();
			WebElement fullNameField = driver.findElement(fullNameFieldLocator);
			fullNameField.click();
			fullNameField.sendKeys("gershon shiraz");
			WebElement emailField = driver.findElement(emailFieldLocator);
			emailField.click();
			emailField.sendKeys("gershonshiraz@gmail.com");
			WebElement sendButton = driver.findElement(sendButtonLocator);
			sendButton.click();
            Thread.sleep(2000);
    		Reporter.reportStep(ReporterStatus.PASS, "Send mail to customer service was successed");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block		
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png",sendButtonLocator);
			Reporter.reportStep(ReporterStatus.FAIL, "Send mail to customer service failed");

			e.printStackTrace();
		}
	}
}
