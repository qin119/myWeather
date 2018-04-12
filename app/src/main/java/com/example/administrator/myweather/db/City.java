package com.example.administrator.myweather.db;

/**
 * Created by Administrator on 2018/4/12 0012.
 */

public class City {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public String CityName;
    public int CityCode;
}
