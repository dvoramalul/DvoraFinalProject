package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.AddItemToCartPage;
import aaa.bbb.FinalProject.pages.RemoveItemCartPage;

public class RemoveItemCarTest extends BaseTest{
 @Test 	
  public void f() throws InterruptedException {
	  
//	 AddItemToCartPage at =new AddItemToCartPage(driver);
	//  at.addItem();
	  RemoveItemCartPage rcg = new RemoveItemCartPage(driver);
	  rcg.removeItem();
  }
}
