package com.example.ashutoshtiwari.databindingsample.adapter;

import com.example.ashutoshtiwari.databindingsample.R;
import com.example.ashutoshtiwari.databindingsample.model.TemperatureData;

import java.util.List;

/**
 * Created by Ashutosh.tiwari on 10/07/17.
 * Adapter to bind the data of items in the recycler view.
 * The Adapter extends a custom MyBaseAdapter
 */

public class MyAdapter extends MyBaseAdapter {

    private List<TemperatureData> data;

    public MyAdapter(List<TemperatureData> data) {
        this.data = data;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForType(int position) {
        return R.layout.rowlayout;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
