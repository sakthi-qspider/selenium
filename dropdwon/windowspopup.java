package dropdwon;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class windowspopup {
	static WebDriver driver;

	@Test
	public void test_CloseAllWindowsExceptMainWindow() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		// It will open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");
		//driver.findElement(By.id("emailTXt")).sendKeys("sakthiaero@ymail.com");
		//driver.findElement(By.id("pwd1")).sendKeys("sakthikaveri");
		//driver.findElement(By.name("login")).click();
	
		
		// To get the main window handle
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
		
			
	}
		
	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
}

