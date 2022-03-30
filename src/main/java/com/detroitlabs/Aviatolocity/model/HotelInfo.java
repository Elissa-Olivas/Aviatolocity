package com.detroitlabs.Aviatolocity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelInfo {
    private int destinationID;
    private List<Hotel> allHotels;


    public HotelInfo(int destinationID, List<Hotel> allHotels) {
        this.destinationID = destinationID;
        this.allHotels = allHotels;
    }

    public HotelInfo() {

    }

    public int getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(int destinationID) {
        this.destinationID = destinationID;
    }

    public List<Hotel> getAllHotels() {
        return allHotels;
    }

    public void setAllHotels(List<Hotel> allHotels) {
        this.allHotels = allHotels;
    }
}
