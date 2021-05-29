package scripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPages.Contactuspage;
import pomPages.SkillraryLoginpage;

public class Contactus extends Baseclass{
	@Test
	public void contactus() throws InterruptedException {
	SkillraryLoginpage s=new SkillraryLoginpage(driver);
	Point loc = s.getContact().getLocation();
	int x=loc.x;
	int y=loc.y;
	utilities.scrollBar(driver, x, y);
	Thread.sleep(5000);
	s.contactus();
	
	Contactuspage con=new Contactuspage(driver);
	con.nametab("name");
	con.emailtab("email");
	con.subjecttab("subject");
	con.messagetab("message");
	con.sendmailbutton();
	
	}
	

}
