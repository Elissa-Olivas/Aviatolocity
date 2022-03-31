package com.detroitlabs.Aviatolocity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private String name;
    private String starRating;
    private Address address;
    private Price price;
    private String srpDesktop;
    private Coordinate coordinate;

    @JsonProperty("ratePlan")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("ratePlan")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("optimizedThumbUrls")
    public String getSrpDesktop() {
        return srpDesktop;
    }

    @JsonProperty("optimizedThumbUrls")
    public void setSrpDesktop(String srpDesktop) {
        this.srpDesktop = srpDesktop;
    }

    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return coordinate;
    }


    @JsonProperty("coordinate")
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
//    @JsonProperty("optimizedThumbUrls")
//    public String getSrpDesktop() {
//        return srpDesktop;
//    }
//    @JsonProperty("optimizedThumbUrls")
//    public void setSrpDesktop(String srpDesktop) {
//        this.srpDesktop = srpDesktop;
//    }
//
//    @JsonProperty("rateplane")
//    public Price getPrice() {
//        return price;
//    }
//
//    @JsonProperty("rateplane")
//    public void setPrice(Price price) {
//        this.price = price;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
