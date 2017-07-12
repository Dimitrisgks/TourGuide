package com.example.hell.tourguidenafpaktos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class Hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_list);

        //Creating a ArrayList: Using String for words
        final ArrayList<List> hoteldetail = new ArrayList<>();
        //Elements below should be added to the array list

        hoteldetail.add(new List(R.string.hotel1, R.string.add1, R.drawable.niki));
        hoteldetail.add(new List(R.string.hotel2, R.string.add2, R.drawable.plaza));
        hoteldetail.add(new List(R.string.hotel3, R.string.add3, R.drawable.nafs));
        hoteldetail.add(new List(R.string.hotel4, R.string.add4, R.drawable.hlion));
        hoteldetail.add(new List(R.string.hotel5, R.string.add5, R.drawable.star));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter creates layouts for each item in the list, using the
        // layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        ListAdapter adapter = new ListAdapter(this, hoteldetail, R.color.main);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each info in the list.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }

}
