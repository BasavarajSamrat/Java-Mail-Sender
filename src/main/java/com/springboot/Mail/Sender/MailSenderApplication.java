package com.springboot.Mail.Sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSenderApplication {

	@Autowired
	private EmailSender emailSender;

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		emailSender.sendEmail("arunkumarjagadi04@gmail.com","Verify Booking Password ","Confirmation of your marriage convention hall in Belluru, All the best for future life plz denote 12 eggs to the hootagalli boys and tell this password  AKUMAAR_AD to them for more discount in catering service.Thank you ");

	}



}
