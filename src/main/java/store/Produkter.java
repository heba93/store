package store;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Produkter {
	WebDriver driver = new FirefoxDriver();


	public void GoToPage(){
		driver.get("http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/");
	}

	public void closeDriver(){
		driver.close();
	}
	
	public void verifyProdukt(){
		  driver.getTitle();
		  Assert.assertEquals("Error unexpected title", "Magic Mouse | ONLINE STORE", driver.getTitle());
		 
	}
	public void ProText(){
		  String ProText = "Splashing Pixels' WordPress e-commerce themes offer the best e-commerce solution for online stores. Our highly customizable WordPress e-commerce theme design and technology is unlike anything else on the market. We put an amazing amount of care and detail into the design and functionality to ensure that we're creating the best user experience for your customers.";
		  String Text = driver.findElement(By.className("product_description")).getText();
		  Assert.assertEquals("Error unexpected description", ProText, Text);
		  
	}
	public void ProPrise(){
		  
		  String ProPrise = driver.findElement(By.className("currentprice")).getText();
		  Assert.assertEquals("Error unexpected price", "$150.00", ProPrise);
		 
		 
		  
	}
	
	public void AddToCart() throws InterruptedException{
		
		 int count1 = Integer.parseInt(driver.findElement(By.className("count")).getText());
		  driver.findElement(By.className("wpsc_buy_button")).click();
		  Thread.sleep(5000);;
		  int count2 = Integer.parseInt(driver.findElement(By.className("count")).getText());
		  Assert.assertEquals("Error unexpected number of items in the cart", count1 + 1, count2);

		
		
		 }
	
	
	
	
	
	

}