package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;
import aaa.bbb.FinalProject.pages.LoginPage;




public class LoginTest extends BaseTest{
	@Test(groups = { "bonding" })
	public void f() {

		LoginPage lg = new LoginPage(driver);
		lg.login();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	


	}
}
