package com.example.anything.model;

public class Doctor {
    private String name;
    private String specialization;
    private String language;
    private double price;
    private String imageUrl;
    private boolean isFavourite;

    public Doctor(String name, String specialization, String language, double price, String imageUrl, boolean isFavourite) {
        this.name = name;
        this.specialization = specialization;
        this.language = language;
        this.price = price;
        this.imageUrl = imageUrl;
        this.isFavourite = isFavourite;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getLanguage() {
        return language;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isFavourite() {
        return isFavourite;
    }
}
