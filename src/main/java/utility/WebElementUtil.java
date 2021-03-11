package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtil {
	
	WebDriver driver;
	
	public WebElementUtil(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getElement(By locator){
		 return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	public void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);	
		}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public List<String> doElementsTextList(By locator){
		List<String> eleTextList = new ArrayList<>();
		
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList){
			if(!e.getText().isEmpty()){
				eleTextList.add(e.getText());
			}
		}
		
		return eleTextList;
		
	}
	/**
	 * DropDown utilities
	 * 
	 * 
	 */
	public void dropDownByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByVisibleText(By locator, String visibletext) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	/**
	 * using getOptions method
	 * @param locator
	 * @param value
	 */
	public void doSelectDropDownValue(By locator, String value){
		Select select = new Select(getElement(locator));
		List<WebElement> optionList= select.getOptions();
		
		for(WebElement e: optionList){
			if(e.getText().equals(value)){
				e.click();
				break;
			}
		}
	}
	
	public void dropDownWithoutSelect(By locator, String value){
			
			List<WebElement> list = getElements(locator);
			for(WebElement e: list){
				if(e.getText().equals(value)){
					e.click();
					break;
				}
			}
		}
}
