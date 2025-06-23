package maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator01 {

	public static void main(String[] args)  {
 WebDriver Driver = new ChromeDriver();
 Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Driver.get("https://www.instagram.com/");

WebElement email = Driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
email.click();
email.sendKeys("dolly");
 WebElement pass = Driver.findElement(By.xpath("(//label[@class=\"_aa48\"])[1]"));
pass.click();
pass.sendKeys("dolly@99999");

WebElement login = Driver.findElement(By.xpath("(//button[@class=\" _aswp _aswr _aswu _asw_ _asx2\"])[1]"));

System.out.println(login.getText());
System.out.println(login.getAttribute("class"));
System.out.println(login.getLocation().x);
System.out.println(login.getLocation().y);
System.out.println(login.getSize());
System.out.println(login.getTagName());
System.out.println(login.isDisplayed());
System.out.println(login.isEnabled());
System.out.println(login.isSelected());
	}

}
