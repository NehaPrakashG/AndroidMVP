package com.example.androidmvp.Presenter;

import com.example.androidmvp.Interface.IDeals;
import com.example.androidmvp.Model.Deals;
import com.example.androidmvp.Model.ModelDealList;

import java.util.List;

public class DealListPresenter implements IDeals.Presenter, IDeals.Model.OnFinishedListener {
    private IDeals.View dealistView;

    private IDeals.Model dealListModel;

    public DealListPresenter(IDeals.View dealistView) {
        this.dealistView = dealistView;
        dealListModel = new ModelDealList();
    }

    @Override
    public void onFinished(List<Deals> dealArrayList) {
        dealistView.setDataToRecyclerView(dealArrayList);
        if (dealistView != null) {
            dealistView.hideProgress();
        }
    }

    @Override
    public void onFailure(Throwable t) {
        dealistView.onResponseFailure(t);
        if (dealistView != null) {
            dealistView.hideProgress();
        }
    }

    @Override
    public void onDestroy() {
        this.dealistView = null;

    }

    @Override
    public void requestDataFromServer() {
        if (dealistView != null) {
            dealistView.showProgress();
        }
        dealListModel.getDealsList(this);
    }
}
