package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
// jivansathi.com locator
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.jeevansathi.com/");

		// id
		Driver.findElement(By.id("__next"));

		// name
		Driver.findElement(By.name("next-head-count"));

		// class name
		Driver.findElement(By.className(null));

        // link text= (href) (black color test)
     Driver.findElement(By.linkText(null));
     
     //partial linked test
     Driver.findElement(By.partialLinkText(null));
		//css= selector cascading style sheet
     //tagname and idvalue = tag#idvalue
     
     Driver.findElement(By.cssSelector("div#__next"));
		
     //tagname and class value
     
     Driver.findElement(By.cssSelector(null));

     //tagname and attribute
     Driver.findElement(By.cssSelector("div[id="__next"]"));
     
     //tag name and multiple attribute
     
     Driver.findElement(By.cssSelector(div[class="flex items-center justify-between"][id="browseprof"]));
     
     //tagname
     
     Driver.findElement(By.tagName());
     
     //contain
     Driver.findElement(By.cssSelector(meta[charset*="utf-8"]));
     //start switch
     Driver.findElement(By.cssSelector(meta[charset^="utf-8"]));
     //endwith $
     
     Driver.findElement(By.cssSelector(meta[name$="viewport"]));
     
     
    //Xpath
     //start with @
     
     Driver.findElement(By.cssSelector(//meta[@name="viewport"]));
     
    		 
	}

}
