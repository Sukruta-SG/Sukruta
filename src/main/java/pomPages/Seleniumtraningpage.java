package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumtraningpage {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbt;
	
	

	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebt;
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takecouse;
	
	public Seleniumtraningpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void playbutton() {
		playbt.click();
	}
	
	public void pausebutton() {
		pausebt.click();
	}
	
	public WebElement getPlaybt() {
		return playbt;
	}

	public WebElement getPausebt() {
		return pausebt;
	}
	
	public void takecoursebt() {
		takecouse.click();
	}
	
}
