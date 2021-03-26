package com.example.aranna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView list_places;

    String s1[], s2[];
    int images[] = {R.drawable.sakura_flats,R.drawable.kagura_flats,R.drawable.sri_ranga_mahal,R.drawable.ranga_park,R.drawable.orion_flats,
                    R.drawable.nissi,R.drawable.vgp,R.drawable.sims};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_places = findViewById(R.id.list_places);
        s1 = getResources().getStringArray(R.array.locations);
        s2 = getResources().getStringArray(R.array.route_calc);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        list_places.setAdapter(myAdapter);
        list_places.setLayoutManager(new LinearLayoutManager(this));

    }
}
