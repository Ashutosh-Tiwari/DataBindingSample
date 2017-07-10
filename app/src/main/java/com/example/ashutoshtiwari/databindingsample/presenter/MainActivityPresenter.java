package com.example.ashutoshtiwari.databindingsample.presenter;

import android.content.Context;

import com.example.ashutoshtiwari.databindingsample.model.TemperatureData;

/**
 * Created by Ashutosh.tiwari on 10/07/17.
 * Presenter Implementation Class
 */

public class MainActivityPresenter implements MainActivityConract.Presenter {

    private MainActivityConract.View view;
    private Context context;

    public MainActivityPresenter(MainActivityConract.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }
}
