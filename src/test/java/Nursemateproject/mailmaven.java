package Nursemateproject;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class mailmaven {
	
public static void main(String[] args) throws EmailException {
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(587);
	email.setAuthenticator(new DefaultAuthenticator("dineshkumarbn05@gmail.com", "iixcyecblgnlhrnv"));
	email.setStartTLSEnabled(true);
	
	
		email.setFrom("dineshkumarbn05@gmail.com");
		email.setSubject("Alert");
		email.setMsg("Your Account is hacked by a great hacker @007");
		email.addTo("kavipriya.pazhani@aroopatech.com");
		email.send();
	System.out.println("email sent");



}
}