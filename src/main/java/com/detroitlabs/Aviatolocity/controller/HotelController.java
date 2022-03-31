package com.detroitlabs.Aviatolocity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {


    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }




    @RequestMapping("/hotel")
    public String displayHotelDetails() {                    //image, name, price, address(streetAddress, locality, postalCode, region)

        return "hotel-details";
    }

    @RequestMapping("/contact")
    public String displayContact() {
        return "contact";
    }



}
