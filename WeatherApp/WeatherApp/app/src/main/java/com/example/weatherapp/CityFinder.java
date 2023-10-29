package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CityFinder extends AppCompatActivity {

    private EditText editText;
    private ImageView back;
    private RelativeLayout mumbai, delhi, kolkata, bangalore, goa, chennai, button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_finder);

        editText = findViewById(R.id.searchCity);
        back = findViewById(R.id.back);

        mumbai = findViewById(R.id.mumbai);
        delhi = findViewById(R.id.delhi);
        kolkata = findViewById(R.id.kolkata);
        bangalore = findViewById(R.id.bangalore);
        goa = findViewById(R.id.goa);
        chennai = findViewById(R.id.chennai);
        button = findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String newCity = editText.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
                return false;
            }
        });

        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.tvMumbai);
                String newCity = tv.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });

        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.tvDelhi);
                String newCity = tv.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });

        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.tvKolkata);
                String newCity = tv.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });

        bangalore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.tvBangalore);
                String newCity = tv.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });

        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.tvGoa);
                String newCity = tv.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });

        chennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.tvChennai);
                String newCity = tv.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newCity = editText.getText().toString().trim();
                Intent intent = new Intent(CityFinder.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);
            }
        });
    }
}