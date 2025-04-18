package mavenforjenkins;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UITest {
	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName) {
		System.out.println("Parameter Value is"+browserName);
		WebDriver driver=null;
		if(browserName.contains("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.contains("Edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/");
		Assert.assertEquals(driver.getTitle().contains("Welcome to Naveen AutomationLabs - naveen automationlabs"),
				true);
		driver.quit();

	}
}
