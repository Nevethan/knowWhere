package com.example.bruger.knowwhere;

/**
 * Created by Bruger on 21-11-2018.
 */

public class Establishment {

    private String Id, name, address, description, type;
    private int lat, lng, ratings;

    public Establishment(){

    }

    public Establishment(String id, String name, String address, String description, String type, int lat, int lng, int ratings) {
        Id = id;
        this.name = name;
        this.address = address;
        this.description = description;
        this.type = type;
        this.lat = lat;
        this.lng = lng;
        this.ratings = ratings;
    }

    public Establishment(String name, String address, String description, String type, int lat, int lng, int ratings) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.type = type;
        this.lat = lat;
        this.lng = lng;
        this.ratings = ratings;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getId() {

        return Id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getLat() {
        return lat;
    }

    public int getLng() {
        return lng;
    }

    public int getRatings() {
        return ratings;
    }
}
