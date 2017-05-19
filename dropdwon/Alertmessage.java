package dropdwon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessage {

	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://login.naukri.com/nLogin/Login.php");
		 driver.findElement(By.id ("emailTxt")).sendKeys("sakthiaero@ymail.com");
		 driver.findElement(By.id("pwd1")).sendKeys("sakthikaveri");
		 driver.findElement(By.name("Login")).submit();
		 
		 Alert alt=driver.switchTo().alert();
		 
		String s= alt.getText();
		 
			 
		 }
		 
		 
		
		
	}


