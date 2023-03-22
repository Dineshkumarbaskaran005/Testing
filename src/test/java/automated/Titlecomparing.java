package automated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Titlecomparing {
	@Test
public  void main() throws InterruptedException {
		
		String A = "Heel: Riding/Underslung";
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.justinboots.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sitemap = driver.findElement(By.xpath("(//a[normalize-space()='Site Map'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);",sitemap);
		sitemap.click();
		driver.findElement(By.xpath("(//a[normalize-space()='Western'])[4]")).click();

		
		driver.findElement(By.xpath("(//button[@aria-label='Heel'])[1]")).click();
		WebElement head  = driver.findElement(By.xpath("(//input[@id='heelHeight-ridingunderslung'])[1]"));
		head.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		
		WebElement header = driver.findElement(By.xpath("(//p[@role='status'])[2]"));
		String text = header.getText();
		System.out.println("Products:"+ text);	
		System.out.println("<---------------------------->");
		
		WebElement findElement = driver.findElement(By.xpath("(//li[@class='col-6 col-sm-4 col-md-6 col-lg-4 col-xl-3 prod-position'])[1]"));
		findElement.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement findElement2 = driver.findElement(By.xpath("(//li[contains(text(),'Heel: Riding/Underslung')])[2]"));
		String text2 = findElement2.getText();
		System.out.println(text2);
		System.out.println("<---------------------------->");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Assert.assertEquals(text2, A);
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("(//button[normalize-space()='Back'])[1]")).click();
		//driver.findElement(By.xpath("(//button[normalize-space()='Back'])[1]")).click();
		
		WebElement findElements = driver.findElement(By.xpath("(//li[@class='col-6 col-sm-4 col-md-6 col-lg-4 col-xl-3 prod-position'])[2]"));
		findElements.click();
		String titles = driver.getTitle();
		System.out.println(titles);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement findElement22 = driver.findElement(By.xpath("(//li[contains(text(),'Heel: Riding/Underlsung')])[2]"));
		String text22 = findElement22.getText();
		System.out.println(text22);
		System.out.println("<---------------------------->");
		driver.findElement(By.xpath("(//button[normalize-space()='Back'])[1]")).click();
	//	driver.findElement(By.xpath("(//button[normalize-space()='Back'])[1]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement findElementss = driver.findElement(By.xpath("(//li[@class='col-6 col-sm-4 col-md-6 col-lg-4 col-xl-3 prod-position'])[3]"));
		findElementss.click();
		String titless = driver.getTitle();
		System.out.println(titless);
		
		WebElement findElement23 = driver.findElement(By.xpath("(//li[contains(text(),'Heel: Riding/Underslung')])[2]"));
		String text23 = findElement23.getText();
		System.out.println(text23);
		
		
		
		
		
		
		

		
		
	
	}

}
