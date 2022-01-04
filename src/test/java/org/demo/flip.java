package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flip extends baseclass {
	@BeforeClass
private void beforeclass() {
		chromeBrowser();

}
	@BeforeMethod
	private void beforemethod() {
	

	}
	@Test
	private void test() {
		
		impWait(10);
		urlLaunch("https://www.flipkart.com/");
		WebElement dd = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		dd.click();
		Loginpage l=new Loginpage();
		
		sendKeys(l.getSrc(), "iphone 11");
		click(l.getSrc1());
		for (int i = 0; i < l.getSrc2().size(); i++) {
			WebElement tt = l.getSrc2().get(i);
			String text = tt.getText();
			System.out.println(text);
			
			
			
		}
		
		for (int i = 0; i < l.getSrc3().size(); i++) {
			WebElement rr = l.getSrc3().get(i);
			String text1 = rr.getText();
			System.out.println(text1);
			
		}

	}
	@AfterMethod
	private void aftermethod() {
		

	}
	@AfterClass
	private void afterclass() {
		

	}

}
