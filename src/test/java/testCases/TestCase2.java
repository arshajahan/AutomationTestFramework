package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pageObjects.SkillraryDemoAppPage;
import pageObjects.SkillraryLoginPage;
import pageObjects.SkillraryTestingPage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException{
		
		SkillraryLoginPage lp = new SkillraryLoginPage(driver);
		lp.gearClk();
		lp.demoAppClk();
		
		driverUtils.switchTab(driver);
		 
		SkillraryDemoAppPage dp = new SkillraryDemoAppPage(driver);
		driverUtils.dropDown(pdata.getData("select1"), dp.getCategoryDD());
		
		SkillraryTestingPage tp = new SkillraryTestingPage(driver);
		driverUtils.dragAndDrop(driver, tp.getSeleniumCourse(), tp.getCartArea());
		driverUtils.scroll(driver, tp.getTwtr());
		tp.twtClk();
	}

}
