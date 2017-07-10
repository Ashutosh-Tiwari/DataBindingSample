package com.example.ashutoshtiwari.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.ashutoshtiwari.databindingsample.databinding.ActivityMainBinding;
import com.example.ashutoshtiwari.databindingsample.model.TemperatureData;
import com.example.ashutoshtiwari.databindingsample.presenter.MainActivityConract;
import com.example.ashutoshtiwari.databindingsample.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityConract.View {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());
        TemperatureData temperatureData = new TemperatureData("Ahmedabad - Gota", "382481");
        binding.setTemperatureData(temperatureData);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius = temperatureData.getCelsius();
        Toast.makeText(this, celsius, Toast.LENGTH_LONG).show();
    }
}