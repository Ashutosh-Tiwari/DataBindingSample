package com.example.ashutoshtiwari.databindingsample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.ashutoshtiwari.databindingsample.BR;

/**
 * Created by Ashutosh.tiwari on 10/07/17.
 * Model Class
 */

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius) {
        this.location = location;
        this.celsius = celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }
}
