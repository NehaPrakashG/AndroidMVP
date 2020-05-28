package com.example.androidmvp.Interface;

import com.example.androidmvp.Model.Deals;

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

        void setDataToRecyclerView(List<Deals> dealArrayList);
        void onResponseFailure(Throwable throwable);

    }

    interface Presenter {

        void onDestroy();
        void getMoreData();

        void requestDataFromServer();

    }
}

