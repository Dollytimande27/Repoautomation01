package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import dynamic_code.BaseClass;

public class Alerts extends BaseClass {
public static void main(String[] args) throws InterruptedException  {

	launch_browser("chrome");
	Hiturl("https://demo.automationtesting.in/");
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	 Alert SA = driver.switchTo().alert();
	System.out.println(SA.getText());
	Thread.sleep(3000);
	SA.accept();
}
}
