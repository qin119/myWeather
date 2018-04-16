package com.example.administrator.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/12 0012.
 */

public class County extends DataSupport{

    public int id;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }


    public String CountyName;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String weatherId;


}
