package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Manali Patel
 *
 */

public class BrowserUtil {

	WebDriver driver;
	
	/**
	 * 
	 * @param browserName
	 * @return webDriver
	 */
	public WebDriver initBrowser(String browserName){
	switch (browserName) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	default:
		System.out.println("Please enter proper browser");
		break;
	}
	return driver;
	
	}
	
	public void launchUrl(String url){
		 driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
