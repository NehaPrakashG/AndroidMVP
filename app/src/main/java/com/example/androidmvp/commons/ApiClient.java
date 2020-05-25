package com.example.androidmvp.commons;

import com.android.volley.RequestQueue;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    private static String BaseURL ="https://www.cheapshark.com/api/1.0/";
    public static RequestQueue PostQue;
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {  // todo Retrofit call to deals api
        try {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BaseURL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retrofit;
    }


}
