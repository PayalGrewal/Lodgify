package com.example.lodgify;

public class HotelData {
    private String location;
    private String name;
    private String price;
    private String rate;
    private String id;
    private String desc;

    public HotelData(){}

    public HotelData(String location, String name, String price, String rate, String id, String desc) {
        this.location = location;
        this.name = name;
        this.price = price;
        this.rate = rate;
        this.id=id;
        this.desc = desc;
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

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
}
