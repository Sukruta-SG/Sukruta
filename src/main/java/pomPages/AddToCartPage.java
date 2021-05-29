package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy(id="add")
	private WebElement addbt;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocart;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getAddbt() {
		return addbt;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	public void addbtn() {
		addbt.click();
	}
	
	public void addtocartbt() {
		addtocart.click();
	}

	
	
}
