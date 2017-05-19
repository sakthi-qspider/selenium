package dropdwon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Elementfontsize {
	@Test
	
	public void testElementfontsize(){
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	WebElement un=driver.findElement(By.id("email"));
	String s=un.getCssValue("color and font-size");
	Reporter.log(s,true);
	driver.close();
	
		
	}

}
