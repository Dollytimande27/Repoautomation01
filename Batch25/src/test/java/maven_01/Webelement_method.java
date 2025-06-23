package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.shaadi.com/");
/*WebElement pack = Driver.findElement(By.cssSelector("input[data-testid=\"login_email\"]"));
pack.click();
pack.sendKeys("dollytimande6548@gamil.com");
System.out.println(pack.getText());
System.out.println(pack.getAttribute("data-testid"));
System.out.println(pack.getLocation().x);
System.out.println(pack.getLocation().y);
System.out.println(pack.getSize());
System.out.println(pack.getTagName());
System.out.println(pack.isDisplayed());
System.out.println(pack.isEnabled());
System.out.println(pack.isSelected()); */

	WebElement Mock = Driver.findElement(By.xpath("(//div[@class=\"Dropdown-control\"])[1]"));
		
	
		

	}

}
