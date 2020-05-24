package com.example.androidmvp.Interface;

import com.example.androidmvp.Model.Deals;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("deals")
    Call<List<Deals>> getDeals();

}

