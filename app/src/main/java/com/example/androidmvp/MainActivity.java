package com.example.androidmvp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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
ImageView joystick_imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getString(R.string.Deals));
       // ActionBar actionBar = getSupportActionBar();
       // actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar_gard));

        initUI();
        dealListPresenter = new DealListPresenter(this);
        dealListPresenter.requestDataFromServer();

    }



    private void initUI() {
        pbLoad= findViewById(R.id.pb_load);
        recyclerView = findViewById(R.id.recyclerView);
        joystick_imgView = findViewById(R.id.joystick_img);
        joystick_imgView.setAlpha(140);
        RecyclerView.LayoutManager recyce = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(recyce);

        dealsList= new ArrayList<>();
        dealsAdapter = new DealsAdapter(this,dealsList);

        recyclerView.setAdapter(dealsAdapter);

    }



    @Override
    public void showProgress() {
        pbLoad.setVisibility(View.VISIBLE);
        joystick_imgView.setVisibility(View.INVISIBLE);

    }

    @Override
    public void hideProgress() {
        pbLoad.setVisibility(View.GONE);
        joystick_imgView.setVisibility(View.VISIBLE);

    }

    @Override
    public void setDataToRecyclerView(List<Deals> dealArrayList) {
        dealsList.clear();
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
