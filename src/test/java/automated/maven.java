package automated;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class maven {
	
	public static void main(String[] args) {
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\DineshKumar.Baskaran\\eclipse-workspace\\Javaproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nursemates.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
	}

}
