package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	
	
	}

}
