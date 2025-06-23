package maven_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args, Duration twenty) {
		
//launch browser
		WebDriver Driver = new ChromeDriver();
		
		
		// maximize window
		
		Driver.manage().window().maximize();
//implicit wait
		
	Driver.manage().timeouts().getImplicitWaitTimeout()
		
	//explicit wait
		
WebDriverWait wait =new WebDriverWait(Driver, twenty);
		wait.until()
	
	}

}
