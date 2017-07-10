package com.example.ashutoshtiwari.databindingsample.presenter;

import com.example.ashutoshtiwari.databindingsample.model.TemperatureData;

/**
 * Created by Ashutosh.tiwari on 10/07/17.
 * Interfaces to interact with UI
 */

public interface MainActivityConract {
    interface Presenter {
        void onShowData(TemperatureData temperatureData);
    }

    interface View {
        void showData(TemperatureData temperatureData);
    }
}
