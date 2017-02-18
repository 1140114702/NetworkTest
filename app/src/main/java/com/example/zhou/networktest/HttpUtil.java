package com.example.zhou.networktest;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhou on 2017/2/18.
 */

public class HttpUtil {

    public static void Request(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request);
    }
}