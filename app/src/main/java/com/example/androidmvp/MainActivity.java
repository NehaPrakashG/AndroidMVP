package com.example.androidmvp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidmvc.R;
import com.example.androidmvp.Interface.IDeals;
import com.example.androidmvp.Model.ModelDealList;
import com.example.androidmvp.Presenter.DealListPresenter;

import java.util.List;


public class MainActivity extends AppCompatActivity implements IDeals.View {
private DealListPresenter dealListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dealListPresenter = new DealListPresenter(this);
        dealListPresenter.requestDataFromServer();
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setDataToRecyclerView(List<ModelDealList> dealArrayList) {

    }

    @Override
    public void onResponseFailure(Throwable throwable) {

    }
}
