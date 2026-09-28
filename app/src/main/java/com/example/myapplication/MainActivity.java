package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button emergencyButton;
    Button contactButton;
    Button locationButton;
    Button servicesButton;
    Button infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emergencyButton = findViewById(R.id.emergencyButton);
        contactButton = findViewById(R.id.contactButton);
        locationButton = findViewById(R.id.locationButton);
        servicesButton = findViewById(R.id.servicesButton);
        infoButton = findViewById(R.id.infoButton);

        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PageActivity.class);
                intent.putExtra("title", "EMERGENCY CALL");
                startActivity(intent);
            }
        });

        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PageActivity.class);
                intent.putExtra("title", "CONTACTS");
                startActivity(intent);
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PageActivity.class);
                intent.putExtra("title", "LOCATION");
                startActivity(intent);
            }
        });

        servicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PageActivity.class);
                intent.putExtra("title", "SERVICES");
                startActivity(intent);
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PageActivity.class);
                intent.putExtra("title", "INFO");
                startActivity(intent);
            }
        });
    }
}