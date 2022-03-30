package com.detroitlabs.Aviatolocity.model;

public class Hotel {
    private String name;
    private int starRating;
    private String streetAddress;
    private String locality;                  //City
    private String region;                    //State
    private int postalCode;                   //zipcode
    private double lat;
    private double lon;
    private int current;                      //price of hotel
    private String srpDesktop;                //picture of hotel


    public Hotel(String name, int starRating, String streetAddress, String locality, String region, int postalCode, double lat, double lon, int current, String srpDesktop) {
        this.name = name;
        this.starRating = starRating;
        this.streetAddress = streetAddress;
        this.locality = locality;
        this.region = region;
        this.postalCode = postalCode;
        this.lat = lat;
        this.lon = lon;
        this.current = current;
        this.srpDesktop = srpDesktop;
    }

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public String getSrpDesktop() {
        return srpDesktop;
    }

    public void setSrpDesktop(String srpDesktop) {
        this.srpDesktop = srpDesktop;
    }
}
