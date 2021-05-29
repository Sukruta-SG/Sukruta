package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public Webdriverutilities utilities=new Webdriverutilities();
	public WebDriver driver;
	public propertyfile p=new propertyfile();
     @BeforeMethod
     public void openapp() throws FileNotFoundException, IOException {
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get(p.getData("url"));
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     }
     
     @AfterMethod
     public void closeapp(ITestResult r) throws IOException {
    	 int status = r.getStatus();
    	 String name = r.getName();
    	 if(status==2) {
    		 Screenshot s=new Screenshot();
    		 s.getPhoto(driver,name);
    	 }
    	 driver.close();
     }
   
}
