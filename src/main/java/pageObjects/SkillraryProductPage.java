package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryProductPage {
	
	@FindBy(xpath="(//span[@class='input-group-btn'])[3]")
	WebElement plusBtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	WebElement addCartBtn;
	
	public SkillraryProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}
	
	public void addCartClk() {
		addCartBtn.click();
	}
	

}
