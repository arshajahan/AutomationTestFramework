package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryCoursesPage {
	
	@FindBy(xpath="(//div[@class='image']/a)[2]")
	WebElement course;
	
	
	public SkillraryCoursesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void courseClk() {
		course.click();
	}
}
