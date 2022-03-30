package com.detroitlabs.Aviatolocity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelInfo {
    private String term;

    private List<Suggestions> suggestions;
    private List<Hotel> allHotels;

    public List<Suggestions> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestions> suggestions) {
        this.suggestions = suggestions;
    }

    public HotelInfo(List<Hotel> allHotels) {
        this.allHotels = allHotels;
    }


    public HotelInfo() {

    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }


    public List<Hotel> getAllHotels() {
        return allHotels;
    }

    public void setAllHotels(List<Hotel> allHotels) {
        this.allHotels = allHotels;
    }
}
