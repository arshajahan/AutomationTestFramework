package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillrarySingleCoursePage {
	WebDriver ldriver;
	
	
	@FindBy(xpath="//button[@aria-label='Play']")
	WebElement playBtn;

	@FindBy(xpath="//button[@aria-label='Pause']")
	WebElement pauseBtn;

	@FindBy(xpath="//span[text()='Add To Wishlist']")
	WebElement wishList;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	WebElement cookiesX;
	
	@FindBy(xpath="//iframe")
	WebElement videoFrame;
	
	public SkillrarySingleCoursePage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	public void playClk() {
		playBtn.click();
	}
	
	public void pauseClk() {
		pauseBtn.click();
	} 
	
	public WebElement getFrame() {
		return videoFrame; 
	}
	
	public void closeCookie() {
		cookiesX.click();
	}
	
	public void wishListClk() { 
		wishList.click();
		
	}
	

}
