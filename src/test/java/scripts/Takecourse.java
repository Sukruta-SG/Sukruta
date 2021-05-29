package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPages.Seleniumpage;
import pomPages.Seleniumtraningpage;
import pomPages.SkillraryLoginpage;

public class Takecourse extends Baseclass{
	
	@Test
	public void takethiscouse() throws InterruptedException, FileNotFoundException, IOException {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.searchtabse(p.getData("search"));
		s.serachbutton();
		
		Seleniumpage sel=new Seleniumpage(driver);
		sel.seleniumtarin();
		
		Seleniumtraningpage tr=new Seleniumtraningpage(driver);
		utilities.switchFrame(driver);
		
		tr.playbutton();
		Thread.sleep(10000);
		tr.pausebutton();
		utilities.switchback(driver);
		tr.takecoursebt();
	}
	


}
