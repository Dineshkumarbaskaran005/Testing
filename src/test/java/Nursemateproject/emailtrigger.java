package Nursemateproject;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class emailtrigger {
@Test
	public static void main() throws EmailException {
		
	
		System.out.println("===================Email===================");

		Email email1 = new SimpleEmail();

		email1.setHostName("smtp.gmail.com");

		email1.setSmtpPort(587);

		email1.setAuthenticator(new DefaultAuthenticator("pradeepapandiyan20@gmail.com", "xpodglgabtzpnuwd"));

		email1.setSSLOnConnect(true);

		try {
			email1.setFrom("pradeepapandiyan20@gmail.com");
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		email1.setSubject("TestMail");

		try {
			email1.setMsg("This is a test mail ... :-)");
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		email1.addTo("dineshkumar.baskaran@aroopatech.com");

		email1.send();

		System.out.println("===================Email===================");

		}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

