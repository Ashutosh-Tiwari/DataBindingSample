package com.example.ashutoshtiwari.databindingsample.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Ashutosh.tiwari on 10/07/17.
 * Standard Recycler View Adapter for general use
 */

abstract class MyBaseAdapter extends RecyclerView.Adapter<MyBaseAdapter.MyViewHolder> {

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, getLayoutIdForType(viewType), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(getDataAtPosition(position));
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Object object) {
            binding.setVariable(BR.temperatureData, object);
            binding.executePendingBindings();
        }
    }

    public abstract Object getDataAtPosition(int position);

    public abstract int getLayoutIdForType(int viewType);
}
