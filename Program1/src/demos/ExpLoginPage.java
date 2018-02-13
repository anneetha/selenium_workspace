package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SetScriptTimeout;
import org.openqa.selenium.support.ui.Select;

public class ExpLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/neethabyju/Workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.express.com/account/signin.jsp");
	    driver.findElement(By.id("signin-email")).sendKeys("bbalan@contractor.express.com");
	    driver.findElement(By.id("signin-password")).sendKeys("Express@12");
	    
	    WebElement frame = driver.findElement(By.cssSelector("div#exp-recaptcha iframe"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.id("recaptcha-anchor")).click();
	    driver.switchTo().defaultContent();
	    TimeUnit.SECONDS.sleep(30);
	    driver.findElement(By.className("un-button-login-lg")).click();

	}

}
