package aaa.bbb.FinalProject.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aaa.bbb.FinalProject.pages.ReporterStatus;

public class ElementsActions {

	public static void click(WebDriver driver, WebElement e, String name) {

		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		wait15.until(ExpectedConditions.visibilityOf(e));

		Reporter.reportStep(ReporterStatus.INFO, "Clicked " + e.getTagName() + " " + name);
		e.click();

	}

	public static void click(WebDriver driver, By by, String name) {

		WebElement e = driver.findElement(by);
		click(driver, e, name);

	}

	public static void sendKeys(WebDriver driver, WebElement e, String text, String name) {

		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		wait15.until(ExpectedConditions.visibilityOf(e));

		Reporter.reportStep(ReporterStatus.INFO, "Entered " + text + " into " + e.getTagName() + " " + name);
		e.sendKeys(text);

	}

	public static void sendKeys(WebDriver driver, By by, String text, String name) {

		WebElement e = driver.findElement(by);
		sendKeys(driver, e, text, name);

	}

	public static boolean verifyElementText(WebDriver driver, By by, String expectedText, String name) {

		WebElement e = driver.findElement(by);

		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		wait15.until(ExpectedConditions.visibilityOf(e));

		Reporter.reportStep(ReporterStatus.INFO, "Got text from " + e.getTagName() + " " + name);
		String actualText = e.getText();
		if(actualText.equals(expectedText)) {
			Reporter.reportStep(ReporterStatus.PASS, "Expected: " + expectedText + "\r\nActual: " + actualText);
			return true;
		}
		else {
			Reporter.reportStep(ReporterStatus.FAIL, "Expected: " + expectedText + "\r\nActual: " + actualText);
			return false;
		}

	}

}
