package com.example.webrequest.models;

public class WeatherData {

    String name;
    String description;
    public String icon;
    Double temp;

    public WeatherData(String name, String description,
                String icon, Double temp) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.temp = temp;
    }
}
