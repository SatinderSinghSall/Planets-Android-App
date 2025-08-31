package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
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
        Planet planets = getItem(position);
        MyViewHolder myViewHolder;
        final View result;

        if(convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.textView_PlantName);
            myViewHolder.planetMoonCount = (TextView) convertView.findViewById(R.id.textView_PlanetMoonCount);
            myViewHolder.planetImage = (ImageView) convertView.findViewById(R.id.imageView_PlanetImage);

            result = convertView;
            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.planetName.setText(planets.getPlanetName());
        myViewHolder.planetMoonCount.setText(planets.getMoonCount());
        myViewHolder.planetImage.setImageResource(planets.getPlanetImage());
        return result;
    }
}
