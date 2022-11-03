package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	
	@FindBy(xpath="//a[text()=' GEARS ']")
	WebElement gearLink;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	WebElement demoAppLink;
	
	@FindBy(name="q")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@value='go']")
	WebElement searchIcon;
	
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void gearClk() {
		gearLink.click();
	}
	
	public void demoAppClk() {
		demoAppLink.click();
	}
	
	public void enterSearch(String input) {
		searchBox.sendKeys(input);
	}
	
	public void searchClk() {
		searchIcon.click();
	}
	
	
	
}
