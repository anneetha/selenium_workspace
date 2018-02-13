package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatePage {

	public static void main(String[] args) throws InterruptedException {
		
		//1.Create WebDriver
		
		System.setProperty("webdriver.chrome.driver","/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		//2.Open browser to Account management page
		
		driver.get("https://www.express.com/account/create-account.jsp");
	    driver.findElement(By.id("sign-up")).click();
	    
	   //3. Fill out the form
		driver.findElement(By.name("firstname")).sendKeys("neetha");
		driver.findElement(By.name("lastname")).sendKeys("nandaneetha");
	    driver.findElement(By.id("signup-email")).sendKeys("nethu.byju@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Neethu12");
	    driver.findElement(By.name("signup-cpassword")).sendKeys("Neethu12");
	    new Select(driver.findElement(By.id("signup-country"))).selectByVisibleText("Australia");
	    
	    
	    //4.how to check the  box
	  
	    WebElement frame = driver.findElement(By.cssSelector("div#exp-recaptcha iframe"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.id("recaptcha-anchor")).click();
	    driver.switchTo().defaultContent();
	    TimeUnit.SECONDS.sleep(30);
	    driver.findElement(By.className("un-button-login-lg")).click();

	    
	   
	   
		
		
		
	}

}
