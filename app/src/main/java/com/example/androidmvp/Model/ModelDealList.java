package com.example.androidmvp.Model;

import android.util.Log;

import com.example.androidmvp.Interface.ApiService;
import com.example.androidmvp.Interface.IDeals;
import com.example.androidmvp.commons.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class ModelDealList implements IDeals.Model {



    @Override
    public void getDealsList( final OnFinishedListener onFinishedListener) {

        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<List<Deals>>call = apiService.getDeals();

            call.enqueue(new Callback<List<Deals>>() {

                @Override
                public void onResponse(Call<List<Deals>> call, Response<List<Deals>> response) {
                    List<Deals> deals = response.body();
                    Log.d(TAG, "Number of deals received: " + deals.size());
                    onFinishedListener.onFinished(deals);
                }

                @Override
                public void onFailure(Call<List<Deals>> call, Throwable t) {
                    try {
                    Log.e(TAG, t.toString());
                    onFinishedListener.onFailure(t);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }


            });

    }


}
