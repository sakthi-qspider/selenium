package dropdwon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
     Select sbvalue=new Select(driver.findElement(By.id("month" )));
     
     sbvalue.selectByValue("4");
     Select sbvisibleText=new Select(driver.findElement(By.id("day")));
     
    sbvisibleText.selectByVisibleText("6");
   Select sbindex=new Select(driver.findElement(By.id("year")));
   
    
  sbindex.selectByIndex(8);
  Thread.sleep(4000);
  
  driver.quit();
	
	
	
	

	}

}
