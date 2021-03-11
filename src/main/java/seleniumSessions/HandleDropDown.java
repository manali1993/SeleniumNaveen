package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By noOfEmp = By.id("Form_submitForm_NoOfEmployees");
		By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		doSelectDropDownValue(noOfEmp, "76 - 100");
		dropDownWithoutSelect(industry, "Education");
	
	}

	public static void doSelectDropDownValue(By locator, String value){
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionList= select.getOptions();
		
		for(WebElement e: optionList){
			if(e.getText().equals(value)){
				e.click();
				break;
			}
		}
	}
	
	public static void dropDownWithoutSelect(By locator, String value){
		
		List<WebElement> list = driver.findElements(locator);
		for(WebElement e1: list){
			if(e1.getText().equals(value)){
				e1.click();
				break;
			}
		}
	}
	
	
	
}
