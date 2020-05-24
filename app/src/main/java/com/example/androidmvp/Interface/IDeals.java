package com.example.androidmvp.Interface;

import com.example.androidmvp.Model.Deals;
import com.example.androidmvp.Model.ModelDealList;

import java.util.List;

public interface IDeals {
    interface Model {

        void getDealsList(OnFinishedListener onFinishedListener);

        interface OnFinishedListener {
            void onFinished(List<Deals> dealArrayList);

            void onFailure(Throwable t);
        }

    }

    interface View {

        void showProgress();

        void hideProgress();

        void setDataToRecyclerView(List<ModelDealList> dealArrayList);

        void onResponseFailure(Throwable throwable);

    }

    interface Presenter {

        void onDestroy();


        void requestDataFromServer();

    }
}

