package automated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class metatitlecomparisionm {
	@Test
	public static void main() {

		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.justinboots.com/");
	     driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
	  //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement Accept = driver.findElement(By.xpath("//button[text()='Accept Cookies']"));
		 js.executeScript("arguments[0].style.border='5px solid Red'",Accept);
		 Accept.click();
		 WebElement sitemap = driver.findElement(By.xpath("//a[text()='Site Map']"));
		 js.executeScript("arguments[0].scrollIntoView();",sitemap);
		 js.executeScript("arguments[0].style.border='5px solid Red'",sitemap);
		 sitemap.click();
		 WebElement Western = driver.findElement(By.xpath("(//a[text()='Western'])[1]"));
		 js.executeScript("arguments[0].style.border='5px solid Red'",Western);
		 Western.click();
		//         List<WebElement> findElements = driver.findElements(By.xpath("//a[@clas='lin product-title']"));
		//        for (WebElement webElement : findElements) {
		//            System.out.println(webElement.getText());
		//        }
		 WebElement proElement = driver.findElement(By.xpath("(//a[@class='link product-title'])[2]"));
		js.executeScript("arguments[0].style.border='2px solid green'",proElement);
		 proElement.click();
		 String az = driver.getTitle();
		 System.out.println("Meta Title ::"+az);
		 String text = driver.findElement(By.xpath("//h1[contains(@class,'product-name')]")).getText();
		 System.out.println("Product Title ::"+text);
 WebElement back = driver.findElement(By.xpath("//div[@class='back-container d-inline']"));
 
 
       String sample = az;
       String compare = sample.replace("| Justin Boots", "");
       String trim = compare.trim();
       System.out.println(trim);
//       compare.equalsIgnoreCase(compare)
 
 
 
 
 
 

js.executeScript("arguments[0].style.border='5px solid Red'",back);
		 back.click();
		// driver.navigate().back();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//		 Actions A=new Actions(driver);
//		 A.doubleClick(back).build().perform();
//		Assert.assertEquals(text, trim);
//        System.out.println("compare passed");



       boolean equalsIgnoreCase = trim.equalsIgnoreCase(text);
       System.out.println(equalsIgnoreCase);











	}









}


