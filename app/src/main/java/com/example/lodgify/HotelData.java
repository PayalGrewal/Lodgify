package com.example.lodgify;

public class HotelData {
    private String location;
    private String name;
    private String price;
    private String rate;

    public HotelData(){}

    public HotelData(String location, String name, String price, String rate) {
        this.location = location;
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }
}
