package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.MyMainPage;

public class SignUpForSalesTest extends BaseTest{
  @Test
  public void f() {
	  
	  MyMainPage mp = new MyMainPage(driver);
	  mp.signUpForSales();
  }
}
