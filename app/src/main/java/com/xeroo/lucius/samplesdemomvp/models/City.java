package com.xeroo.lucius.samplesdemomvp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lucius on 09/04/2017.
 */

public class City {
    @SerializedName("country")
    private String country;
    @SerializedName("city_name")
    private String cityName;

    public City(String country, String cityName) {
        this.country = country;
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
