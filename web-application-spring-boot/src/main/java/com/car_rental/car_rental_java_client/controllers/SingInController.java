package com.car_rental.car_rental_java_client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingInController {
    @GetMapping("/signin")
    public String getSignInPage() {
        return "signin_page";
    }
}
