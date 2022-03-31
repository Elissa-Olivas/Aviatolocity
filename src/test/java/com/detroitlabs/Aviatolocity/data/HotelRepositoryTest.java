package com.detroitlabs.Aviatolocity.data;

import com.detroitlabs.Aviatolocity.model.Hotel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class HotelRepositoryTest {

    @Test
    void generateHotels() throws IOException {
        HotelRepository hotelRepository = new HotelRepository();
        hotelRepository.generateHotels("Detroit", "2022-05-08", "2022-05-10");
        for (Hotel hotel: hotelRepository.getAllHotels()) {
            System.out.println(hotel.getName());
        }
    }
}