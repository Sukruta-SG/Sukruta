package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
	
	@FindBy(name="name")
	private WebElement nametb;
	
	@FindBy(name="sender")
	private WebElement Emailtb;
	
	@FindBy(name="subject")
	private WebElement subjecttb;
	
	@FindBy(name="message")
	private WebElement messagetb;
	
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendmailbtn;
	
	public Contactuspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void nametab(String name) {
		nametb.sendKeys(name);
	}
	
	public void emailtab(String email) {
		Emailtb.sendKeys(email);
	}
	
	public void subjecttab(String subject) {
		subjecttb.sendKeys(subject);
	}

	public void messagetab(String message) {
		messagetb.sendKeys(message);
	}
	
	public void sendmailbutton() {
		sendmailbtn.click();
	}
}
