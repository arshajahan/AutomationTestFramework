package genericLib;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	
	public void dropDown(String text, WebElement ele) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void switchToFrame(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void swithFromFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	

	 
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchTab(WebDriver driver) {
		String parentTab = driver.getWindowHandle();
		Set<String> allTabs = driver.getWindowHandles();
		for(String child: allTabs) {
			if(!child.equals(parentTab))
				driver.switchTo().window(child);
		}
		
	}
	 
//	This function is used if you want to scroll to a fixed location when you know the x and y
	public void scroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
//	This function is used if you want to scroll to an element
	public void scroll(WebDriver driver, WebElement ele) {
		Point p = ele.getLocation();
		scroll(driver, p.getX(), p.getY());
	}
	

	/**
	 * Wait for element to appear on the webpage
	 */
	public void waitForElementToBeVisible(WebDriver driver, By locatorObject) {
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObject));
	}


	/**
	 * Waits for element to become interactive/clickable
	 */
	public void waitForElementToBeClickable(WebDriver driver, By locatorObject) {
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(locatorObject));
	}
	

}
