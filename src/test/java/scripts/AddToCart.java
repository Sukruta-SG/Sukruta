package scripts;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPages.AddToCartPage;
import pomPages.DemoSkillraryLoginpage;
import pomPages.SkillraryLoginpage;

public class AddToCart extends Baseclass{
	@Test
	public void addproduct() {
SkillraryLoginpage s=new SkillraryLoginpage(driver);
s.gearsbtton();
s.skillarydempapp();

utilities.switchtab(driver);

DemoSkillraryLoginpage d=new DemoSkillraryLoginpage(driver);
utilities.mouseHover(driver, d.getCoursebt());
d.seleniumtraningbutton();

AddToCartPage a=new AddToCartPage(driver);
utilities.doubleClick(driver, a.getAddbt());
a.addtocartbt();
utilities.alertPopup(driver);


	}

}
