package Nursemateproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {
	@Parameters("browser")
	@Test
	public static void main( String browsername) {
		RemoteWebDriver driver = null;
		
		System.out.println("parameter value is "+ browsername);
		if (browsername.contains("Chrome")) {
			
			 driver = new ChromeDriver();
			
		}
		
		else if (browsername.contains("Firefox")) {
			 driver = new FirefoxDriver();
		}
		
        driver.get("https://www.nursemates.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
	}
	
	
//	<systemPropertyVariables>
//	<browser>${browser}</browser>
//</systemPropertyVariables>
	
	
	
	
	
	
	
	
	

}
