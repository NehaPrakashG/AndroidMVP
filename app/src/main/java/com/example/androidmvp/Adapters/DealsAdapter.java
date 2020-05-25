package com.example.androidmvp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidmvc.R;
import com.example.androidmvp.MainActivity;
import com.example.androidmvp.Model.Deals;

import java.util.List;

public class DealsAdapter extends RecyclerView.Adapter<DealsAdapter.MyViewHolder> {
    private List<Deals>dealsList;
    private Context context;


    public DealsAdapter(MainActivity mainActivity, List<Deals> dealsList) {
        this.context=mainActivity;
        this.dealsList= dealsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deals_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
       Deals deal = dealsList.get(position);
        holder.titletv.setText(deal.getTitle());
        //holder.pricetv.setText(String.valueOf(dealsList.get(position).getNormalPrice()));

    }

    @Override
    public int getItemCount() {
        return dealsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
       public  TextView titletv,pricetv;
        public MyViewHolder(View itemView) {
            super(itemView);
            titletv = itemView.findViewById(R.id.title);
            pricetv = itemView.findViewById(R.id.price);
        }
    }
    }


