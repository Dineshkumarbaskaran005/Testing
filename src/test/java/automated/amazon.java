package automated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {
	@Test
	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]")).sendKeys("Iphone13");
		driver.findElement(By.xpath("(//input[@id='nav-search-submit-button'])[1]")).click();
		driver.quit();
		
		
		
	}

}
