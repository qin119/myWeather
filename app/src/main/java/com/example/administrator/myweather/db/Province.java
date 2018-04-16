package com.example.administrator.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/12 0012.
 */

public class Province extends DataSupport{
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String provinceName;
    public int provinceCode;

}
