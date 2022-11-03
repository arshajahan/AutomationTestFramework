package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryTestingPage {
	
	@FindBy(xpath="//img[@id='Selenium Training']")
	WebElement seleniumCourse;
	
	@FindBy(xpath="//div[@id='cartArea']")
	WebElement cartArea;
	
	@FindBy(xpath="//ul[@class='list-socialicons']/li[1]")
	WebElement twtr;
	
	public SkillraryTestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void twtClk() {
		twtr.click();
	}

	public WebElement getSeleniumCourse() {
		return seleniumCourse;
	}

	public WebElement getCartArea() {
		return cartArea;
	}

	public WebElement getTwtr() {
		return twtr;
	}
	

}
