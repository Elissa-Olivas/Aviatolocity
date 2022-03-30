package com.detroitlabs.Aviatolocity.service;


import com.detroitlabs.Aviatolocity.model.HotelInfo;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HotelService {


    public HotelInfo fetchDestinationId(String locationID) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-RapidAPI-Host", "hotels4.p.rapidapi.com");
        httpHeaders.add("X-RapidAPI-Key", "374ccf4573msh51eac29f92de632p16fbc8jsna5fd4e1fb025");
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity responseEntity = restTemplate.exchange(
                "https://hotels4.p.rapidapi.com/locations/v2/search?query=" + locationID, HttpMethod.GET, httpEntity, String.class);
        HotelInfo hotelInfo = new HotelInfo();
        JSONPObject
        hotelInfo.setDestinationID(responseEntity.getBody());
        return hotelInfo;
    }

    public ResponseEntity fetchHotelDetails(String destinationID, String checkIn, String checkout) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-RapidAPI-Host", "hotels4.p.rapidapi.com");
        httpHeaders.add("X-RapidAPI-Key", "374ccf4573msh51eac29f92de632p16fbc8jsna5fd4e1fb025");
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
        return restTemplate.getForObject(
                "https://hotels4.p.rapidapi.com/properties/list?destinationId=" + destinationID + "&pageNumber=1&pageSize=5&checkIn=" + checkIn + "&checkOut=" + checkout + "&adults1=1&sortOrder=PRICE", HOTEL.class);
    }
}
