package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryLoginpage {
	
	@FindBy(id="course")
	private WebElement coursebt;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraning;

	public DemoSkillraryLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void seleniumtraningbutton() {
		seleniumtraning.click();
	}
	
	public WebElement getCoursebt() {
		return coursebt;
	}

	

}
