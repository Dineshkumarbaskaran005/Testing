package Nursemateproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class firefox {
	
	@Test
	public static void main( ) {
	
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.nursemates.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
	}
	

}
