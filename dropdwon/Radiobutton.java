package dropdwon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Radiobutton {
	@Test
	
	
	public void testRadiobutton() throws Exception{
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement usernameradiobtn=driver.findElement(By.xpath(".//*[@id='userRad']"));
	boolean radiobuttonisdisplayed=usernameradiobtn.isDisplayed();
	
Reporter.log("is username radio button is dispaled",true);
	
	boolean radiobuttonisEnabled= usernameradiobtn.isEnabled();
	Reporter.log(" is username radio button is Enabled",true);
	boolean radiobuttonisSelected=usernameradiobtn.isSelected();
	Reporter.log(" is username radio button is Selected",true);
	
	
	boolean radiobuttonNewSelectionStatus=usernameradiobtn.isSelected();
	usernameradiobtn.click();
	
	driver.close();
	 
	
	
	
	
		
		
		
	}

}
