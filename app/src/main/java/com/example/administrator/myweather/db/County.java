package com.example.administrator.myweather.db;

/**
 * Created by Administrator on 2018/4/12 0012.
 */

public class County {

    public int id;

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

    public int getCountyCode() {
        return CountyCode;
    }

    public void setCountyCode(int countyCode) {
        CountyCode = countyCode;
    }

    public String CountyName;
    public int CountyCode;


}
