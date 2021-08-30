package Samsung.GalaxyS10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class windowsTest {
	
	WebDriver wd;
	
	
	@Test
	public void performWindows() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\arif\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		wd = new EdgeDriver();
		wd.get("https://www.microsoft.com/en-in");
		wd.findElement(By.cssSelector("a#shellmenu_2")).click();
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void afterclassMethod()
	{
		wd.close();
	}

}
