package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class SearchItemInBrowserPage extends BasePage {

	By driedFruitTabLocator = By.xpath("(//input[@placeholder='אם לא תחפש איך תמצא?'])[1]");

	By searcButtonLocator=By.xpath("(//button[@class='jet-ajax-search__submit'])[1]");
	By by=null;
	public SearchItemInBrowserPage(WebDriver driver) {
		super(driver);
	}


	public void searcItemInCart() {
		try {
			WebElement g =driver.findElement(driedFruitTabLocator);
			Thread.sleep(1000);
			g.sendKeys("תאנים");
			Thread.sleep(2000);
			WebElement searcButton =driver.findElement(searcButtonLocator);
			searcButton.click();
			Thread.sleep(2000);
			verifyElementClickabke(by);
			Thread.sleep(2000);
			Reporter.reportStep(ReporterStatus.INFO, "search item in shopmarket ended successfuly");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			takeItemScreenshot("C:\\Users\\dvora\\colors\\screenshot.png");
			Reporter.reportStep(ReporterStatus.FAIL,"search item in shopmarket failed");
            e.printStackTrace();
		}

	}
}
