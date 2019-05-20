package com.example.brom.listviewjsonapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class MountainAdapter extends ArrayAdapter<Mountain> {

    public MountainAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Mountain> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    //@NonNull
    //@Override
    //public View getView(int position, View COnvertView, ViewGroup parent)
    //{

    //}
}
