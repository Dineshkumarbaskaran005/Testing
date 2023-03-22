package automated;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class justinboot {
	@Test
	public void main() throws Exception {
	        //ScreenRecorderUtil.startRecord("main");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.justinboots.com/");
			Actions builder = new Actions(driver);
			
			
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Men']"));
			builder.moveToElement(element).perform();
			driver.findElement(By.xpath("//div[@id='megaNav-men']//a[@class='navItem__anchor text-title_8'][normalize-space()='T-Shirts']")).click();
			driver.findElement(By.xpath("//ul[@class='row product-grid mt-md-5']//li[1]")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//span[normalize-space()='L']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//a[normalize-space()='View Cart & Check Out']")).click();
			WebElement women = driver.findElement(By.xpath("//a[normalize-space()='Women']"));
			builder.moveToElement(women).perform();
			driver.findElement(By.xpath("(//a[@class='navItem__anchor text-title_8'][normalize-space()='Western'])[2]")).click();
			driver.findElement(By.cssSelector(".col-6.col-sm-4.col-md-6.col-lg-4.col-xl-3.prod-position[data-position='2']")).click();
			driver.findElement(By.xpath("(//button[@id='size-6.5'])[1]")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//a[normalize-space()='View Cart & Check Out'])[1]")).click();
			driver.findElement(By.xpath("(//a[normalize-space()='Checkout Now'])[1]")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//a[normalize-space()='Checkout as Guest'])[1]")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//input[@id='shippingFirstName'])[1]")).sendKeys("Test");
			driver.findElement(By.xpath("//input[@id='shippingLastName']")).sendKeys("Data");
			driver.findElement(By.xpath("(//input[@id='shippingAddressOne'])[1]")).sendKeys("NO:1/5");
			driver.findElement(By.xpath("(//input[@id='shippingAddressTwo'])[1]")).sendKeys("Liberty street");
			driver.findElement(By.xpath("(//input[@id='shippingAddressCity'])[1]")).sendKeys("Chennai");
			WebElement state = driver.findElement(By.xpath("(//select[@id='shippingState'])[1]"));
			Select mystate = new Select(state);
			mystate.selectByValue("NY");
			driver.findElement(By.xpath("(//input[@id='shippingZipCode'])[1]")).sendKeys("10005");
			driver.findElement(By.xpath("(//input[@id='shippingEmail'])[1]")).sendKeys("Test@gmail.com");
			driver.findElement(By.xpath("(//input[@id='shippingPhoneNumber'])[1]")).sendKeys("9897949596");
			//WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
			driver.findElement(By.xpath("(//button[normalize-space()='Next: Payment'])[1]")).click();
	        



	}

}
