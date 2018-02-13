package com.openqa.selenium;

public class FirefoxDriver implements WebDriver{
	
public FirefoxDriver(){
		
		System.out.println("launching a FirefoxDriver");
}
		
	
	

public void click(String locator) {
	
		
		System.out.println("click an element in FirefoxDriver:"+ locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		
		System.out.println("Typed an element in FirefoxDriver:"+locator+"value enetered"+value);
		
		
	}

}
