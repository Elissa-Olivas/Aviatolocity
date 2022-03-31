package com.detroitlabs.Aviatolocity.data;


import com.detroitlabs.Aviatolocity.model.Data;
import com.detroitlabs.Aviatolocity.model.Hotel;
import com.detroitlabs.Aviatolocity.model.HotelInfo;
import com.detroitlabs.Aviatolocity.model.HotelResponse;
import com.detroitlabs.Aviatolocity.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class HotelRepository {     //Data,Body,SearchResults, Results (hotel name, starRating, address, Price, Coordinates, srpDesktop(URL IMAGE))

    private Data data;

    private List<Hotel> allHotels;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Hotel> getAllHotels() {
        return allHotels;
    }

    public void setAllHotels(List<Hotel> allHotels) {
        this.allHotels = allHotels;
    }


    public void generateHotels (String location, String checkIn, String checkout) throws IOException {
        allHotels = new ArrayList<>();
        int locationId = HotelService.fetchDestinationId(location).getSuggestions().get(0).getEntities().get(0).getDestinationId();
        HotelResponse hotelResponse = HotelService.fetchHotelDetails(locationId, checkIn, checkout);
        for (int h = 0; h < 5; h++) {
            String name = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getName();
            String starRating = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getStarRating();
            String streetAddress = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getAddress().getStreetAddress();
            String locality = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getAddress().getLocality();
            String region = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getAddress().getRegion();
            String postalCode = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getAddress().getPostalCode();
            double lat= 42.400634;
            double lon= -83.061243;

//            long lat = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getCoordinates().getLat();
//            long lon = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getCoordinates().getLon();
            String price = hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getPrice().getCurrent();
            String image =  hotelResponse.getData().getBody().getSearchResults().getResults().get(h).getSrpDesktop();

            allHotels.add(new Hotel(name, starRating, streetAddress, locality, region, postalCode,lat, lon, price, image));
        }
    }


    //method to change month from mm/dd/yyyy to yyyy/mm/dd

}
