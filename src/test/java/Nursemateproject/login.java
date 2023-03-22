package Nursemateproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class login {
	@Test
	public  void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nursemates.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
		driver.findElement(By.xpath("(//a[@class='navItem__anchor'])[6]")).click();
		
	}

}
