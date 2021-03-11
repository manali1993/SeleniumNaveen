package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {


		WebDriver driver = null;
		String browser = "safari";
		


		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Naveen Classes\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Naveen Classes\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please enter proper browser");
			break;
		}
		

		driver.get("http://www.google.com");
		String title = driver.getTitle();
		if(title.equals("Google")){
			System.out.println("Title is correct");
		}else
			System.out.println("title isnot correct");
		
		driver.quit();
		
		
	}

}
