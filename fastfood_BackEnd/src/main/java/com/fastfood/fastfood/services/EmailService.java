package com.fastfood.fastfood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 *
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Service("emailService")
public class EmailService {

    private JavaMailSender mailSender;

    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Async
    public void sendEmail(String emailID) {
        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(emailID);
			mail.setSubject("Enjoy excited taste and food");
			mail.setText("Dear Customer,"
						+"\n\n	Thanks for being our valuable customer and for your continuous support "
						+"\n There are many exciting offers to satisfy your hunger"
						+" \n come and check it on our website"
						+"\n\n Thanks for choosing ELEFoods....Have a Nice Day!!");

        mailSender.send(mail);

    }
}
