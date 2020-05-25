package com.example.androidmvp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidmvc.R;
import com.example.androidmvp.Adapters.DealsAdapter;
import com.example.androidmvp.Interface.IDeals;
import com.example.androidmvp.Model.Deals;
import com.example.androidmvp.Presenter.DealListPresenter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements IDeals.View {
private DealListPresenter dealListPresenter;
private static final String TAG = "DealsActivity";
RecyclerView recyclerView;
private  List<Deals>dealsList;
private DealsAdapter dealsAdapter;
private ProgressBar pbLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getString(R.string.Deals));

        initUI();
        dealListPresenter = new DealListPresenter(this);
        dealListPresenter.requestDataFromServer();

    }



    private void initUI() {
        pbLoad= findViewById(R.id.pb_load);
        recyclerView = findViewById(R.id.recyclerView);
        dealsList= new ArrayList<>();
        dealsAdapter = new DealsAdapter(this,dealsList);
        recyclerView.setAdapter(dealsAdapter);

    }



    @Override
    public void showProgress() {
        pbLoad.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress() {
        pbLoad.setVisibility(View.GONE);

    }

    @Override
    public void setDataToRecyclerView(List<Deals> dealArrayList) {
        dealsList.addAll(dealArrayList);
        dealsAdapter.notifyDataSetChanged();

    }

    @Override
    public void onResponseFailure(Throwable throwable) {
        Log.e(TAG, throwable.getMessage());
        Toast.makeText(this, getString(R.string.comnError), Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        dealListPresenter.onDestroy();
    }
}
