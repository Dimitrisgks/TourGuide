package com.example.hell.tourguidenafpaktos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

//same comments with hotel
public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_list);
        final ArrayList<List> restaurantdetail = new ArrayList<>();
        restaurantdetail.add(new List(R.string.rest1, R.string.ra1, R.drawable.thomas));
        restaurantdetail.add(new List(R.string.rest2, R.string.ra2, R.drawable.captain));
        restaurantdetail.add(new List(R.string.rest3, R.string.ra3, R.drawable.taste));
        restaurantdetail.add(new List(R.string.rest4, R.string.ra4, R.drawable.centro));
        restaurantdetail.add(new List(R.string.rest5, R.string.ra5, R.drawable.faganas));
        ListAdapter adapter = new ListAdapter(this, restaurantdetail, R.color.main);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
