package automated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class amazon {
	@Test
	public static void main() {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("remote allow origins");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]")).sendKeys("Iphone14");
		driver.findElement(By.xpath("(//input[@id='nav-search-submit-button'])[1]")).click();
		driver.quit();
		
		
	}

}
