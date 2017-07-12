package com.example.hell.tourguidenafpaktos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Night extends AppCompatActivity {
    // same comments with hotel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_list);

        final ArrayList<List> nightdetail = new ArrayList<>();
        nightdetail.add(new List(R.string.night1, R.string.nadd1, R.drawable.mojo));
        nightdetail.add(new List(R.string.night2, R.string.nadd2, R.drawable.paradise));
        nightdetail.add(new List(R.string.night3, R.string.nadd3, R.drawable.suita));
        nightdetail.add(new List(R.string.night4, R.string.nadd4, R.drawable.bar2));
        nightdetail.add(new List(R.string.night5, R.string.nadd5, R.drawable.beer));
        ListAdapter adapter = new ListAdapter(this, nightdetail, R.color.main);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
