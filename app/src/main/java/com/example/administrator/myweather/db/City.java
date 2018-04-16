package com.example.administrator.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/12 0012.
 */

public class City extends DataSupport {
    public int id;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int provinceId;

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
