package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoappbt;
	
	@FindBy(linkText="Contact Us")
	private WebElement contact;
	
	@FindBy(name="q")
	private WebElement searchtab;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public SkillraryLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void gearsbtton() {
		gearsbtn.click();
	}
	
	public void skillarydempapp() {
		demoappbt.click();
	}
	
	public void contactus() {
		contact.click();
	}

	public WebElement getContact() {
		return contact;
	}
	
	public void searchtabse(String search) {
		searchtab.sendKeys(search);
	}
	
	public void serachbutton() {
		searchbtn.click();
	}
}
