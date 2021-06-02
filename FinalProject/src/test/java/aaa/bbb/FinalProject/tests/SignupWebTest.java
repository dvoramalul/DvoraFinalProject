package aaa.bbb.FinalProject.tests;
import org.testng.annotations.Test;
import aaa.bbb.FinalProject.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SignupWebTest  extends BaseTest{
	
	
//	WebDriver driver = null;
	@Test(groups = { "bonding" })
	public void f(){
     
		LoginPage lg = new LoginPage(driver);
		lg.signUp();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectTopMenu(String item) {

		try {

			WebElement menuItem = driver.findElement(By.xpath("//u"));
			menuItem.click();
			Thread.sleep(4000);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
}
