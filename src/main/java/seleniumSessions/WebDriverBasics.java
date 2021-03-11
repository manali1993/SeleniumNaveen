package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen Classes\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		if(title.equals("google")){
			System.out.println("Title is correct");
		}else
			System.out.println("title isnot correct");
		
		driver.quit();
	}

}
