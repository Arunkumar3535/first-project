package org.demo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends baseclass {  
	public Loginpage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(name="q")
	private WebElement src;
	
   @FindBy(className="L0Z3Pu")
   private WebElement src1;
   
   @FindBy(className="_4rR01T")
   private List<WebElement> src2;
   
   @FindBy(className="_30jeq3 _1_WHN1")
   private List<WebElement> src3;

public WebElement getSrc() {
	return src;
}

public void setSrc(WebElement src) {
	this.src = src;
}

public WebElement getSrc1() {
	return src1;
}

public void setSrc1(WebElement src1) {
	this.src1 = src1;
}

public List<WebElement> getSrc2() {
	return src2;
}

public void setSrc2(List<WebElement> src2) {
	this.src2 = src2;
}

public List<WebElement> getSrc3() {
	return src3;
}

public void setSrc3(List<WebElement> src3) {
	this.src3 = src3;
}
   
   
   
   
   
	
	}



