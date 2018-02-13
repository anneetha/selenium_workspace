
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.openqa.selenium.safari.SafariDriver;

public class Rc_day1 {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.safari.driver", "/Users/neethabyju/Workspace/Selenium/SafariDriver.safariextz");
			
		SafariDriver driver = new SafariDriver();
		driver.get("http://express.com");
        System.out.println(driver.getTitle());
       
        
        
	}

}
