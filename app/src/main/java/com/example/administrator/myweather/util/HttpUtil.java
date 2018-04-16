package com.example.administrator.myweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/4/12 0012.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(final String address, final okhttp3.Callback callback){
        new Thread(new Runnable() {
            @Override
            public void run() {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url(address).build();
                client.newCall(request).enqueue(callback);
            }
        }).start();

    }
}
