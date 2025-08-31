package com.example.planetsapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter(@NonNull Context context, int resource, ArrayList<Planet> planetArrayList, Context context1) {
        super(context, R.layout.item_list_layout, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context1;
    }
}
