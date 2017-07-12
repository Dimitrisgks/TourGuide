package com.example.hell.tourguidenafpaktos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

//same comments with hotel
public class Sight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_list);
        final ArrayList<List> sightdetail = new ArrayList<>();
        sightdetail.add(new List(R.string.si1, R.string.sa1, R.drawable.church));
        sightdetail.add(new List(R.string.si2, R.string.sa2, R.drawable.statue));
        sightdetail.add(new List(R.string.si3, R.string.sa3, R.drawable.castle));
        sightdetail.add(new List(R.string.si4, R.string.sa4, R.drawable.statue2));
        sightdetail.add(new List(R.string.si5, R.string.sa5, R.drawable.tower));
        ListAdapter adapter = new ListAdapter(this, sightdetail, R.color.main);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
