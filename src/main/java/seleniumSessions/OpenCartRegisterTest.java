package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BrowserUtil;
import utility.WebElementUtil;

public class OpenCartRegisterTest {

	public static void main(String[] args) {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.initBrowser("chrome");

		browserUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By passwordConfirm = By.id("input-confirm");
		
		WebElementUtil elementUtil = new WebElementUtil(driver);
		elementUtil.doSendKeys(firstName, "Manali");
		elementUtil.doSendKeys(lastName, "Patel");
		elementUtil.doSendKeys(email, "Manali@gmail.com");
		elementUtil.doSendKeys(telephone, "123456789");
		elementUtil.doSendKeys(password, "Manali123");
		elementUtil.doSendKeys(passwordConfirm, "Manali123");
		
		browserUtil.quitBrowser();

	}

}
