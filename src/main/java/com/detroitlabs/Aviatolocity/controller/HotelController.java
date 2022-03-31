package com.detroitlabs.Aviatolocity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {


    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }


     //image, name, price, address(streetAddress, locality, postalCode, region)

    @RequestMapping("/hotel")
    public String displayHotelDetails() {
        return "hotel-details";
    }

    @RequestMapping("/contact")
    public String displayContact() {
        return "contact";
    }



}
