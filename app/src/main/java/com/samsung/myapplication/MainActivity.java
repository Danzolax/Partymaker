package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.navigation.ui.AppBarConfiguration;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView view = findViewById(R.id.list);
        view.addItemDecoration(new SpaceItemDecorator(100));

        MyAdapter adapter = new MyAdapter(getData());

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);

        view.setLayoutManager(manager);

    }

    public ArrayList<Event> getData() {
        ArrayList<Event> data = new ArrayList<>();

        data.add(new Event("Sankt-Petersburg",
                "16+",
                "First player stand",
                "14:15",
                "04 april",
                "145m",
                R.drawable.event_image));
        data.add(new Event ("Moscow",
                "12+",
                "Burger",
                "20:00",
                "05 april",
                "1km",
                R.drawable.event_burger));

        return data;
    }
}
