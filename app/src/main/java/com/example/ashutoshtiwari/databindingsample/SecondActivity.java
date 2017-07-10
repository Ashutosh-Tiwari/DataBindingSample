package com.example.ashutoshtiwari.databindingsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ashutoshtiwari.databindingsample.adapter.MyAdapter;
import com.example.ashutoshtiwari.databindingsample.model.TemperatureData;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<TemperatureData> items = Arrays.asList(new TemperatureData("GOTA", "382481"), new TemperatureData("Bajwa", "391310"));

        adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
