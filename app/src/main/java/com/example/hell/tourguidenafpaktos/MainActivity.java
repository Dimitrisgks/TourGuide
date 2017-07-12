package com.example.hell.tourguidenafpaktos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the TextView that shows the hotel text category
        // Set a clickListener on that View
        TextView HotelText = (TextView) findViewById(R.id.HotelText);
        HotelText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the hotel activity
                Intent HotelIntent = new Intent(MainActivity.this, Hotel.class);
                //Start the new activity
                startActivity(HotelIntent);
            }
        });
        //find the image view that shows the hotel image category
        // Set a click listener on that view
        ImageView HotelImage = (ImageView) findViewById(R.id.HotelImage);

        HotelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the hotel activity
                Intent HotelIntent = new Intent(MainActivity.this, Hotel.class);
                //Start the new activity
                startActivity(HotelIntent);
            }
        });
        //Find the TextView that shows the restaurant text category
        // Set a clickListener on that View
        TextView RestaurantText = (TextView) findViewById(R.id.RestaurantText);
        RestaurantText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the restaurant activity
                Intent RestaurantIntent = new Intent(MainActivity.this, Restaurant.class);
                //Start the new activity
                startActivity(RestaurantIntent);
            }
        });
        //find the image view that shows the Restaurant image category
        // Set a click listener on that view
        ImageView RestaurantImage = (ImageView) findViewById(R.id.RestaurantImage);

        RestaurantImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the restaurant activity
                Intent RestaurantIntent = new Intent(MainActivity.this, Restaurant.class);
                //Start the new activity
                startActivity(RestaurantIntent);
            }
        });

        //Find the TextView that shows the Sight text category
        // Set a clickListener on that View
        TextView SightText = (TextView) findViewById(R.id.SightText);
        SightText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the sight activity
                Intent SightIntent = new Intent(MainActivity.this, Sight.class);
                //Start the new activity
                startActivity(SightIntent);
            }
        });
        //find the image view that shows the Sight image category
        // Set a click listener on that view
        ImageView SightImage = (ImageView) findViewById(R.id.SightImage);

        SightImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the sight activity
                Intent SightIntent = new Intent(MainActivity.this, Sight.class);
                //Start the new activity
                startActivity(SightIntent);
            }
        });
        //Find the TextView that shows the Night text category
        // Set a clickListener on that View
        TextView NightText = (TextView) findViewById(R.id.NightText);
        NightText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the Night activity
                Intent NightTextIntent = new Intent(MainActivity.this, Night.class);
                //Start the new activity
                startActivity(NightTextIntent);
            }
        });
        //find the image view that shows the Night image category
        // Set a click listener on that view
        ImageView NightImage = (ImageView) findViewById(R.id.NightImage);
        NightImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Night activity
                Intent NightIntent = new Intent(MainActivity.this, Night.class);
                //Start the new activity
                startActivity(NightIntent);
            }
        });
    }
}
