package com.example.planetsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView = findViewById(R.id.listView);
        ArrayList<Planet> planetArrayList = new ArrayList<>();

        Planet Earth = new Planet("Earth", "1 Moon", R.drawable.earth);
        Planet Mercury = new Planet("Mercury", "0 Moon", R.drawable.mercury);
        Planet Venus = new Planet("Venus", "0 Moon", R.drawable.venus);
        Planet Mars = new Planet("Mars", "2 Moons", R.drawable.mars);
        Planet Jupiter = new Planet("Jupiter", "79 Moons", R.drawable.jupiter);
        Planet Saturn = new Planet("Saturn", "83 Moons", R.drawable.saturn);
        Planet Uranus = new Planet("Uranus", "27 Moons", R.drawable.uranus);
        Planet Neptune = new Planet("Neptune", "14 Moons", R.drawable.neptune);

        planetArrayList.add(Earth);
        planetArrayList.add(Mercury);
        planetArrayList.add(Venus);
        planetArrayList.add(Mars);
        planetArrayList.add(Jupiter);
        planetArrayList.add(Saturn);
        planetArrayList.add(Uranus);
        planetArrayList.add(Neptune);

        adapter = new MyCustomAdapter(this, planetArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Planet Name: " + adapter.getItem(position).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
