package testCases;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pageObjects.SkillraryDemoAppPage;
import pageObjects.SkillraryLoginPage;
import pageObjects.SkillraryProductPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() throws InterruptedException {
		SkillraryLoginPage lp = new SkillraryLoginPage(driver);
		lp.gearClk();
		lp.demoAppClk();
		
		driverUtils.switchTab(driver);
		
		SkillraryDemoAppPage dap = new SkillraryDemoAppPage(driver);
		driverUtils.mouseHover(driver, dap.getCourseLink());
		dap.selTrainClk();
		
		SkillraryProductPage pp = new SkillraryProductPage(driver);
		Thread.sleep(2000);
		driverUtils.doubleClick(driver, pp.getPlusBtn());
		pp.addCartClk();
		Thread.sleep(3000);
		driverUtils.acceptAlert(driver);
	}
	

}
