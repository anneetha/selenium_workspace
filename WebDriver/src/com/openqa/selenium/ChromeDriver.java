package com.openqa.selenium;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver(){
		System.out.println("launching a ChromeDriver");
	}
	@Override
	public void click(String locator) {
		System.out.println("click an element in Chrome:"+ locator);
		
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed an element in Chrome:"+locator+"value enetered"+value);
		
	}

}
