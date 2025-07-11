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
		emailSender.sendEmail("destination email","subject of email ","Body");

	}



}
