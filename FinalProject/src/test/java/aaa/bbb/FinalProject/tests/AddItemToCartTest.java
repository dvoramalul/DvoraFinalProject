package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.AddItemToCartPage;

public class AddItemToCartTest  extends BaseTest {
  @Test
  
  public void f() {
	  
	  AddItemToCartPage at =new AddItemToCartPage(driver);
	  at.addItem();
	  
  }
}
