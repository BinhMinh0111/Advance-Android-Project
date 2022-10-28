package com.example.advance_android_project.modle;

public class Place {
    private int idPlace;
    private String namePlace;
    private String country;
    private int imgPlace;
    private  int rating;

    public Place(int idPlace, String namePlace, String country, int imgPlace) {
        this.idPlace = idPlace;
        this.namePlace = namePlace;
        this.country = country;
        this.imgPlace = imgPlace;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImgPlace() {
        return imgPlace;
    }

    public void setImgPlace(int imgPlace) {
        this.imgPlace = imgPlace;
    }

}
