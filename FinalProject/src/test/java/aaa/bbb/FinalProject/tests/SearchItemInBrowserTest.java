package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.SearchItemInBrowserPage;

public class SearchItemInBrowserTest extends BaseTest{
  @Test
  public void f() {
	  
	  SearchItemInBrowserPage df = new SearchItemInBrowserPage(driver);
	  df.searcItemInCart();
  }
}
