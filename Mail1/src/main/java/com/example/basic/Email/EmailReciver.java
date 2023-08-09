package com.example.basic.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailReciver {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendemail")
    public String sendEmail() {
        emailService.sendSimpleEmail("ohmsethu002@gmail.com", "Hello", "This is a test email.");
        return "Email sent!";
    }
}