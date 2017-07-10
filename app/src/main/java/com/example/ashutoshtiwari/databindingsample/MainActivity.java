package com.example.ashutoshtiwari.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ashutoshtiwari.databindingsample.databinding.ActivityMainBinding;
import com.example.ashutoshtiwari.databindingsample.model.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    User user = new User("Ashutosh", "Tiwari");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
    }
}