package store;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckOut {
	WebDriver driver = new FirefoxDriver();

	 public void goToPage(){
	 
	    driver.get("http://store.demoqa.com/");
	 }

	 public void closeDriver(){
	  driver.close();
	 }

	 public void Text(){

	  driver.findElement(By.className("cart_icon")).click();
	  String empty = driver.findElement(By.className("entry-content")).getText();
	  Assert.assertEquals("Error: Cart is not empty","Oops, there is nothing in your cart." , empty);

	 }


	 public void Remove() throws InterruptedException {
	  driver.findElement(By.className("buynow")).click();
	  driver.findElement(By.className("wpsc_buy_button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.className("go_to_checkout")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")).click();
	  String empty = driver.findElement(By.className("entry-content")).getText();
	  Assert.assertEquals("Error: Cart is not empty","Oops, there is nothing in your cart." , empty);
	 }

	 public void UppdateQ() throws InterruptedException {
	  driver.findElement(By.className("buynow")).click();
	  driver.findElement(By.className("wpsc_buy_button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.className("go_to_checkout")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys("0");
	  driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
	  String price = driver.findElement(By.className("pricedisplay")).getText();
	  Assert.assertEquals("Error unexpected price","$1,500.00", price); 
	 }

	 public void RemovePro() throws InterruptedException {
	  driver.findElement(By.className("buynow")).click();
	  driver.findElement(By.className("wpsc_buy_button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.className("go_to_checkout")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys(Keys.BACK_SPACE, "0");
	  driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
	  String empty = driver.findElement(By.className("entry-content")).getText();
	  Assert.assertEquals("Error: Cart is not empty","Oops, there is nothing in your cart." , empty);
	 }


	 public void YourCart() throws InterruptedException {
	  driver.findElement(By.className("buynow")).click();
	  driver.findElement(By.className("wpsc_buy_button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.className("go_to_checkout")).click();
	  Thread.sleep(5000);
	  String headerColor = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[1]")).getCssValue("color");
	  Assert.assertEquals("some message", "rgba(0, 0, 0, 1)", headerColor);


	 }

}
