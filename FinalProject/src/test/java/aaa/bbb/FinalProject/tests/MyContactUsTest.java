package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.ContactUsPage;




public class MyContactUsTest extends BaseTest {
	@Test
	public void f() {

		ContactUsPage cp = new ContactUsPage(driver);
		cp.contactUs();
	}

}
