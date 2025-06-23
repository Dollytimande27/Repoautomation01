package maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railyatri {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.railyatri.in/");
		WebElement Rail = Driver.findElement(By.cssSelector("input#fromstation"));
		Rail.click();
		Rail.sendKeys("Wardha");
		Rail.getText();
		Rail.getAttribute("id");
	System.out.println(Rail.getText());
System.out.println(Rail.getText());
System.out.println(Rail.getAttribute("id"));



	}
}