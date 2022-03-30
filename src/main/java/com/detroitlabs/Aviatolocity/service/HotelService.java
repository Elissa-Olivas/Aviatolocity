package com.detroitlabs.Aviatolocity.service;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HotelService {


    public void fetchDestinationId(String locationID) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://hotels4.p.rapidapi.com/locations/v2/search?query=" + locationID, HOTEL.class);
    }

    public void fetchHotelDetails(String destinationID, String checkIn, String checkout) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://hotels4.p.rapidapi.com/properties/list?destinationId=" + destinationID + "&pageNumber=1&pageSize=5&checkIn=" + checkIn + "&checkOut=" + checkout + "&adults1=1&sortOrder=PRICE", HOTEL.class);
    }
}
