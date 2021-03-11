package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BrowserUtil;
import utility.WebElementUtil;

public class AmazonFooterLinks {
	

	public static void main(String[] args) {
		
		BrowserUtil browserUtil = new BrowserUtil();
		
		WebDriver driver = browserUtil.initBrowser("chrome");

		browserUtil.launchUrl("https://www.amazon.ca/");
		
		By footerLinks = By.xpath("//*[@class='navFooterMoreOnAmazon']");
		WebElementUtil elementUtil = new WebElementUtil(driver);
		
		List<String> allLinks = elementUtil.doElementsTextList(footerLinks);
		for(String e: allLinks){
			System.out.println(e);
		}
		
		browserUtil.quitBrowser();
		
		
		
		
		
		
		
		

	}

}
