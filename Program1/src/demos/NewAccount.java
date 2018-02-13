package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	
	public static void main(String[] args) {
       String fristname = "neetha";
       String Lastname = "nandaneetha";
       String EmailAddress = "nethu.byju@gmail.com";
       String Password = "Neethu12";
       String ConfirmPassword = "Neethu12";
       String Country = "Australia" ;
       
       
		
		//1.Create WebDriver
		
		System.setProperty("webdriver.chrome.driver","/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		//2.Open browser to Account management page
		
		driver.get("https://www.express.com/account/create-account.jsp");
	    driver.findElement(By.id("sign-up")).click();
	    
	   //3. Fill out the form
		driver.findElement(By.name("firstname")).sendKeys("fristname");
		driver.findElement(By.name("lastname")).sendKeys("Lastname");
	    driver.findElement(By.id("signup-email")).sendKeys("EmailAddress");
	    driver.findElement(By.name("password")).sendKeys("Password");
	    driver.findElement(By.name("signup-cpassword")).sendKeys("ConfirmPassword");
	    new Select(driver.findElement(By.id("signup-country"))).selectByVisibleText("Country");
	    
	    
	    //4.how to check the  box
	  
	    WebElement frame = driver.findElement(By.cssSelector("div#exp-recaptcha iframe"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.id("recaptcha-anchor")).click();
	    driver.switchTo().defaultContent();
	    try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.className("un-button-login-lg")).click();

	    
	}

}
