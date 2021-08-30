package Samsung.GalaxyS10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class xBoxTest {
	
	WebDriver wd;
	@Test
	public void performOffice() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arif\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.microsoft.com/en-in");
		wd.findElement(By.cssSelector("a#shellmenu_3")).click();
		System.out.println("This changes are for develop branches only");
		Thread.sleep(3000);
		
	}

	@AfterClass
	public void afterclassMethod()
	{
		wd.close();
	}

}
