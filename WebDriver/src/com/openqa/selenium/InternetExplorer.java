package com.openqa.selenium;

public class InternetExplorer implements WebDriver {
	
public InternetExplorer(){
		
		System.out.println("launching a InternetExplorer");
}
		
	
	
	
	public void click(String locator) {
	
	
	System.out.println("click an element in IE:"+ locator);
}

public void sendKeys(String locator, String value) {
	
	System.out.println("Typed an element in IE:"+locator+"value enetered"+value);
	
	
}

}



