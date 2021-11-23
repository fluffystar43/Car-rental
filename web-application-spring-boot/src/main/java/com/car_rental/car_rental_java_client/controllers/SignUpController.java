package com.car_rental.car_rental_java_client.controllers;

import com.car_rental.car_rental_java_client.entities.Client;
import com.car_rental.car_rental_java_client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/signup")
    public String getSignUpPage() {
        return "signup_page";
    }

    @PostMapping("/signup")
    public String signUpClient(Client client) {
        client.setPassword("password213");
        client.setLogin("random");
        client.setHashPassword(passwordEncoder.encode(client.getPassword()));
        clientRepository.save(client);
        return "redirect:/signup";
    }
}
