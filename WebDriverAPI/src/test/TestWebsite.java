package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebsite {
		

		public static void main(String[] args) {
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://google.com");
			driver.click();
			driver.getTitle();
			driver.sendKeys();
			
			
		

	}

}
