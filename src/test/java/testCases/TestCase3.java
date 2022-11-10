package testCases;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pageObjects.SkillraryCoursesPage;
import pageObjects.SkillraryLoginPage;
import pageObjects.SkillrarySingleCoursePage;

public class TestCase3 extends BaseClass{
	
	@Test
	public void tc3() throws InterruptedException {
		
		SkillraryLoginPage lp = new SkillraryLoginPage(driver);
		lp.enterSearch("core java for selenium");
		lp.searchClk();
		
		SkillraryCoursesPage cp = new SkillraryCoursesPage(driver);
		cp.courseClk();
		
		SkillrarySingleCoursePage scp = new SkillrarySingleCoursePage(driver);
		scp.closeCookie();
		driverUtils.switchToFrame(driver, scp.getFrame());
		scp.playClk();
		scp.pauseClk();
		driverUtils.swithFromFrame(driver);
		scp.wishListClk();
	}

}
