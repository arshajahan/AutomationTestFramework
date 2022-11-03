package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage {
	
	@FindBy(xpath="//a[text()='COURSE']")
	WebElement courseLink;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	WebElement selTrainLink;
	
	@FindBy(name="addresstype")
	WebElement categoryDD;
	
	
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selTrainClk() {
		selTrainLink.click();
	}

	public WebElement getCourseLink() {
		return courseLink;
	}
	
	public WebElement getCategoryDD() {
		return categoryDD;
	}
	
	

}
