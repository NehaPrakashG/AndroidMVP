package com.example.androidmvp.commons;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit = null;
    private static String BaseURL ="https://www.cheapshark.com/api/1.0/";

    public static Retrofit getClient() {
        try {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BaseURL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return retrofit;
    }
}
