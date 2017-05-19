package dropdwon;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifybrokenlink {
public static void main(String[] args){
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("Total link are "+ links.size());
for(int i=0; i<links.size();i++)
{
	WebElement ele= links.get(i);
	String url=ele.getAttribute("href");
	verifyLinkActive(url);
}

	
	
}

private static void verifyLinkActive(String url) {
try{
	 
	URL url1 = new URL(url);
     
     HttpURLConnection httpURLConnect=(HttpURLConnection)url1.openConnection();
     
     httpURLConnect.setConnectTimeout(3000);
     
     httpURLConnect.connect();
     
     if(httpURLConnect.getResponseCode()==200)
     {
         System.out.println(url+" - "+httpURLConnect.getResponseMessage());
      }
    if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
     {
         System.out.println(url+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
      }
  } catch (Exception e) {
     
  }
} 




}

