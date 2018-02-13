package com.bytrix;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebPage {

	public static void main(String[] args) {

		//subCategory();
		category();
		//subAndCategory();
	}

	public static void subAndCategory() {
		// finding the men

		System.setProperty("webdriver.chrome.driver", "/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.express.com/");

		Actions a = new Actions(driver);

		a.moveToElement((WebElement) driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/nav/ul")))
				.perform();

		List<WebElement> listElement = driver.findElements(By.xpath("/html/body/div[2]/header/div[2]/div/nav/u"));
		for (int i = 0; i < listElement.size(); i++) {
			String elementText = listElement.get(i).getText();
			System.out.println(elementText);

		}

	}

	public static void category() {
		// finding the men
		System.setProperty("webdriver.chrome.driver", "/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.express.com/");

		Actions a = new Actions(driver);

		a.moveToElement((WebElement) driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/nav/ul")))
				.perform();

		List<WebElement> listElement = driver.findElements(By.xpath("/html/body/div[2]/header/div[2]/div/nav/ul"));
		for (int i = 0; i < listElement.size(); i++) {
			String elementText = listElement.get(i).getText();
			System.out.println(elementText);
		}

	}

	public static void subCategory() {
		// finding the men
		System.setProperty("webdriver.chrome.driver", "/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.express.com/");

		Actions a = new Actions(driver);

		a.moveToElement(
				(WebElement) driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/nav/ul/li[1]/ul")))
				.perform();

		List<WebElement> listElement = driver.findElements(By.className("subnav-container"));
		for (int i = 0; i < listElement.size(); i++) {
			String elementText = listElement.get(i).getText();
			System.out.println(elementText);
		}

	}

}
