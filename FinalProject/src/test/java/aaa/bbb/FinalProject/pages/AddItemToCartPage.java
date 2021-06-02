package aaa.bbb.FinalProject.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class AddItemToCartPage extends BasePage{
	
	
	By plusButtonLocator = By.xpath("(//input[@class='qty_button plus'])[1]");
	
	By addItemButtonLocator = By.xpath("(//button[@name='add-to-cart'])[1]");
	
	By cartIconButtonLocator=By.xpath("//span[@class='xt_woofc-trigger-close-icon']");
	
	
	public AddItemToCartPage(WebDriver driver) {
		super(driver);
	}


	
	public void addItem() {
		
		try {
		
			selectTopMenu("פירות יבשים");
			Thread.sleep(2000);
			Reporter.reportStep(ReporterStatus.INFO, "Items category was selected");
			selectTopMenu("אגס טבעי מיובש ללא תוספת סוכר");
			Reporter.reportStep(ReporterStatus.INFO, "Item was selected");
            Thread.sleep(2000);
			WebElement plusItemBtn = driver.findElement(plusButtonLocator);
			plusItemBtn.click();
			Thread.sleep(2000);
			WebElement addItemBtn = driver.findElement(addItemButtonLocator);
			addItemBtn.click();
			Reporter.reportStep(ReporterStatus.INFO, "Add item button was selected");
            Thread.sleep(2000);
			WebElement cartIcon = driver.findElement(cartIconButtonLocator);
			cartIcon.click();
			Reporter.reportStep(ReporterStatus.INFO, "Client clicked on cart");
            verifyItemsAddedTocart("אגס טבעי מיובש ללא תוספת סוכר");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.reportStep(ReporterStatus.FAIL, "Client didn't successeed to add item to  cart");
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");

		}
	}
}
