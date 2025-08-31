package com.example.planetsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter(@NonNull Context context, int resource, ArrayList<Planet> planetArrayList, Context context1) {
        super(context, R.layout.item_list_layout, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context1;
    }

    private static class MyViewHolder {
        TextView planetName;
        TextView planetMoonCount;
        ImageView planetImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);
        MyViewHolder myViewHolder;
        final View result;
    }
}
