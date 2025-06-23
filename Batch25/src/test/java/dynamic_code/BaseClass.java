package dynamic_code;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void launch_browser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}
		
		System.out.println("the browser lauched is as :" +browser);
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	public static void Hiturl(String url) {
		driver.get(url);		
		System.out.println("the title of webpage is as:"+driver.getTitle());		
	}
	
	
	
	
	
}
