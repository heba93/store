package store;

import org.junit.*;

public class TestAddToCart{
AddToCart start = new AddToCart();

	 @Before
	 public void goToPage(){
	  start.GoToPage();
	 }


	 @After
	 public void closeDriver(){
	  start.closeDriver();
	 }

	 @Test
	 public void AddToCart()throws InterruptedException{
	  start.AddToCart1();

	 }
	 
	 @Test
	 public void GoToChekOut() throws InterruptedException{
	  start.GoToChekOut();
	  
	 }
	 
	 @Test
	 public void ContinueShopping() throws InterruptedException{
	  start.continueShopping();
	 }

}
