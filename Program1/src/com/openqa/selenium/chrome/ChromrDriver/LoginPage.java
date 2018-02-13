package com.openqa.selenium.chrome.ChromrDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.E.com");
		driver.findElement(By.id("email")).sendKeys("byjuprasad_iic@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("F0R@LL@C0UNT");
		driver.findElement(By.id("loginbutton")).click();
		
			

	}

}
