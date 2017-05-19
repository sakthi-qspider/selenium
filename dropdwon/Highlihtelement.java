package dropdwon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Highlihtelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=( JavascriptExecutor)driver;
		WebElement password=driver.findElement(By.id("pwd1"));
		
		 js.executeScript("arguments[1].setAttribute('style,'border: solid 2px red'');", password);
		 
		
		
		
		
		

	}

}
