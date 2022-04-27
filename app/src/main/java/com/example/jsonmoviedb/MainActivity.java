package com.example.jsonmoviedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView showJson = (ImageView) findViewById(R.id.json);
        ImageView showJsonAPI = (ImageView) findViewById(R.id.json);
        ImageView showMovieDB = (ImageView) findViewById(R.id.json);

        showJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, JsonParseActivity.class);
                startActivity(intent);
            }
        });
        showJsonAPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, JsonParseActivity.class);
                startActivity(intent);
            }
        });
        showMovieDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, JsonParseActivity.class);
                startActivity(intent);
            }
        });
    }
}