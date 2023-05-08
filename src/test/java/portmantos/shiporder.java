package portmantos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shiporder {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portmantosoms.azurewebsites.net/login");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("DineshKumar.Baskaran@aroopatech.com");
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Aroopa@123");
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Inventory = driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div[1]/div/div[2]/div[2]/ul/div[1]/li/div"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Inventory).perform();
	    driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/ul/a[1]")).click();
		
	
		
	}


}
