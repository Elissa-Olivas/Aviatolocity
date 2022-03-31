package com.detroitlabs.Aviatolocity.controller;


import com.detroitlabs.Aviatolocity.data.HotelRepository;
import com.detroitlabs.Aviatolocity.model.UserSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Map;

@Controller
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    UserSearch userSearch;

    @GetMapping("/")
    public String displayHome() {
        return "home";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String routeToHotelPage(@RequestParam Map<String, String> userInput) {
        System.out.println(userInput.get("location"));
        System.out.println(userInput.get("checkin"));
        System.out.println(userInput.get("checkout"));
        userSearch.setLocation(userInput.get("location"));
        userSearch.setCheckInDate(userInput.get("checkin"));
        userSearch.setCheckOutDate(userInput.get("checkout"));



        return "redirect:/hotel";

    }

    @RequestMapping("/hotel")
    public String displayHotelDetails(ModelMap modelMap) throws IOException {  //image, name, price, address(streetAddress, locality, postalCode, region)
        hotelRepository.generateHotels(userSearch.getLocation(), userSearch.getCheckInDate(), userSearch.getCheckOutDate());
        modelMap.put("hotels", hotelRepository.getAllHotels());

        return "hotel-details";
    }

    @RequestMapping("/contact")
    public String displayContact() {
        return "contact";
    }



}
