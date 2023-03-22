package Nursemateproject;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class nursemate {
	RemoteWebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	@Test (priority = 1)
	public void WomensProductsCount() throws InterruptedException, EmailException {


		driver.get("https://www.nursemates.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
		driver.findElement(By.xpath("(//a[@class='navItem__anchor'])[1]")).click();
		WebElement findElement = driver.findElement(By.xpath("(//p[@class='search-result-count'])[2]"));
		String text = findElement.getText();
		String replaceAll = text.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		int expectedData = 121;
		int result = Integer.parseInt(replaceAll);

		if (result <= expectedData - 5) {
			//			System.out.println("Need to trigger a email 'quantity is lesser than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Women!");
			email.setMsg("Women's category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedData+"\n"+ "Actual Product Count= " + replaceAll);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();





		} else if ((result >= expectedData + 5) ) {
			//			System.out.println("Need to trigger a email 'quantity is greater than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Women!");

			email.setMsg("Women's category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedData+"\n"+ "Actual Product Count= " + replaceAll);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();


		}
		else  {
			System.out.println("No Issues");
		}


		Thread.sleep(1000);


	} 
	@Test (priority = 2)
	public void slipon () throws EmailException {  
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='navItem__anchor'])[1]"));
		action.moveToElement(findElement2).build().perform();
		driver.findElement(By.xpath("(//a[@class='navItem__anchor text-title_8'][normalize-space()='Slip On'])[1]")).click();
		WebElement findElement = driver.findElement(By.xpath("(//p[@class='search-result-count'])[2]"));
		String a = findElement.getText();
		String b = a.replaceAll("[^0-9]", "");
		System.out.println(b);

		int expectedDatass = 20;
		int result = Integer.parseInt(b);

		if (result <= expectedDatass - 5) {
			//				System.out.println("Need to trigger a email 'quantity is lesser than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Women!");
			email.setMsg("Women's category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedDatass+"\n"+ "Actual Product Count= " + b);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();





		} else if ((result >= expectedDatass + 5) ) {
			//				System.out.println("Need to trigger a email 'quantity is greater than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Women!");

			email.setMsg("Women's (Footwear)-Slip On category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedDatass+"\n"+ "Actual Product Count= " + b);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();


		}
		else  {
			System.out.println("No Issues");
		}


		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}



	@Test (priority = 3)

	public void MensProductsCount() throws EmailException {
		driver.findElement(By.xpath("(//a[@class='navItem__anchor'])[6]")).click();
		WebElement findElements = driver.findElement(By.xpath("(//p[@class='search-result-count'])[2]"));
		String texts = findElements.getText();
		String replaceAlls = texts.replaceAll("[^0-9]", "");
		System.out.println(replaceAlls);



		int expectedDatas = 25;
		int results = Integer.parseInt(replaceAlls);

		if (results <= expectedDatas - 5) {
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Men!");
			email.setMsg("Men category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedDatas+"\n"+ "Actual Product Count= " + replaceAlls);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();


		} else if ((results >= expectedDatas + 5) ) {
			//			System.out.println("Need to trigger a email 'quantity is greater than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Men!");
			email.setMsg("Men category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedDatas+"\n"+ "Actual Product Count= " + replaceAlls);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();


		}
		else  {
			System.out.println("No Issues");
		}




	}
	@Test (priority = 4)
	public void menssocks () throws EmailException {  
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='navItem__anchor'])[6]"));
		action.moveToElement(findElement2).build().perform();
		driver.findElement(By.xpath("(//a[@class='navItem__anchor text-title_8'][normalize-space()='Socks'])[1]")).click();
		WebElement findElementss = driver.findElement(By.xpath("(//p[@class='search-result-count'])[2]"));
		String c = findElementss.getText();
		String d = c.replaceAll("[^0-9]", "");
		System.out.println(d);

		int expectedDatasss = 7;
		int result = Integer.parseInt(d);

		if (result <= expectedDatasss - 5) {
			//			System.out.println("Need to trigger a email 'quantity is lesser than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Men(Socks&Apparel)!");
			email.setMsg("Men's(Socks&Apparel) category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedDatasss+"\n"+ "Actual Product Count= " + d);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();





		} else if ((result >= expectedDatasss + 5) ) {
			//			System.out.println("Need to trigger a email 'quantity is greater than actual'");
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
			email.setStartTLSEnabled(true);


			email.setFrom("dineshkumarbn05@gmail.com");
			email.setSubject("Alert - Issue with Product count for the category - Men!");

			email.setMsg("Men's(Socks&Apparel) category count doesn't match"+"\n"+ "-------------------------------" +"\n"+ "Expected Product Count= " + expectedDatasss+"\n"+ "Actual Product Count= " + d);
			email.addTo("DineshKumar.Baskaran@aroopatech.com");
			email.send();


		}
		else  {
			System.out.println("No Issues");
		}



	}








	@Test (priority = 5)
	public void browserquit() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();



	}









}














