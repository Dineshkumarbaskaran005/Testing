package automated;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class mailnurse {

	public static void main(String[] args) throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.office365.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("DineshKumar.Baskaran@aroopatech.com", "Divi@005"));
		email.setSSLOnConnect(true);
		email.setFrom("DineshKumar.Baskaran@aroopatech.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail)");
		email.addTo("DineshKumar.Baskaran@aroopatech.com");
		email.send();
		System.out.println("Mail sent!");
	}



}


