package aaa.bbb.FinalProject.pages;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aaa.bbb.FinalProject.utils.ElementsActions;
import aaa.bbb.FinalProject.utils.Reporter;

public class BasePage {
	
	public  WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;

	}

	public BasePage() {


	}
	public void verifyItemsAddedTocart(String existItemName)  {
		
		try {
			
			driver.findElement(By.xpath("(//a[contains(.,'"+ existItemName +"')])[1]"));
			Reporter.reportStep(ReporterStatus.PASS, "Item added to cart successfuly");	
		
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		
	}
	
  /*	public void verifyItemsRemovedcart(String existItemName)  {
		
		try {		
		WebElement t = driver.findElement(By.xpath("(//a[contains(.,'"+ existItemName +"')])[1]"));
		if (t==null) {
			System.out.println("t==null");
			Reporter.reportStep(ReporterStatus.PASS, "Item not exists in cart ");
		} 
		else {
          Reporter.reportStep(ReporterStatus.FAIL, "Item not exists in cart ");
		}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}  */
	
	public void verifyElementClickabke(By by) {
		try {
			
			WebDriverWait wt = new WebDriverWait(driver,6);
	        wt.until(ExpectedConditions.elementToBeClickable(by));
			Reporter.reportStep(ReporterStatus.PASS, "Button was clicked successfully");

	
		} catch (Exception e) {
			// TODO: handle exception
			
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");
			Reporter.reportStep(ReporterStatus.FAIL, "Button was not clicked");

		}
		   
	}
	public  void takeItemScreenshot(String imagePath, By by) {
		try { 
			WebElement element = driver.findElement(by); 
			File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE); 
			FileHandler.copy(src, new File(imagePath));
			Reporter.reportStep(ReporterStatus.INFO, "Screenshot was successeed");

	} catch (Exception e) {
		System.out.println("The exception for takeScreenshot function. " + e.getMessage()); 
		Reporter.reportStep(ReporterStatus.FAIL, "Screenshot clicked successfuly");

		}
	}
	public  void takeItemScreenshot(String imagePath) {
		try { 
		 
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
			FileHandler.copy(src, new File(imagePath));
			Reporter.reportStep(ReporterStatus.INFO, "Screenshot was successeed");

	} catch (Exception e) {
		System.out.println("The exception for takeScreenshot function. " + e.getMessage()); 
		Reporter.reportStep(ReporterStatus.FAIL, "Screenshot clicked successfuly");

		}
	}
	
	public WebElement selectTopMenu(String menuText) throws InterruptedException {
		
		WebElement menuItem = driver.findElement(By.linkText(menuText));
		ElementsActions.click(driver, menuItem, menuText);
		Thread.sleep(2000);
		return menuItem;
		
		
	}
	

}
