package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class RemoveItemCartPage extends BasePage{



	By cartIconButtonLocator=By.xpath("//span[@class='xt_woofc-trigger-close-icon']");

	By removeItemButtonLocator = By.xpath("(//a[@href='#'])[1]");


	public RemoveItemCartPage(WebDriver driver) {
		super(driver);
	}



	public void removeItem() throws InterruptedException {

        try {
        	Thread.sleep(3000);
        	WebElement cartIconButton=driver.findElement(cartIconButtonLocator);
        	cartIconButton.click(); 
        	WebElement removeButton=driver.findElement(removeItemButtonLocator);
        	removeButton.click();
        	verifyElementClickabke(By.xpath("אגס טבעי מיובש ללא תוספת סוכר"));
			Reporter.reportStep(ReporterStatus.INFO, "Client removed item from cart successfuly");

		} catch (Exception e) {
			// TODO: handle exception
			Reporter.reportStep(ReporterStatus.FAIL, "Client didn't removed item from cart successfuly");
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");

		}
		

	}
}
