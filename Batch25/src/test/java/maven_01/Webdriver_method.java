package maven_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method {

	public static void main(String[] args) {
		
		
		//launch chrome
		
WebDriver Driver = new ChromeDriver();

//webdriver.interface methods
// get ("string URl);

Driver.get("https://www.amazon.in/india/s?k=india#:~:text=Amazon.in%3A%20India");
/*get title

Driver.getTitle();

//get current url

Driver.getCurrentUrl();

//get page source

Driver.getPageSource();

//find element

Driver.findElement(null);
//find elements

Driver.findElements(null);
//close

Driver.close();

//quite

Driver.quit();

//get window handle

Driver.getWindowHandle();

//getwindowhandles

Driver.getWindowHandles();

//swichto

Driver.switchTo();
//navigate

Driver.navigate();*/

//manage

Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//minimize
Driver.manage().window().minimize();

	}

}
