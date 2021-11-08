package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Welcome extends AppCompatActivity {
    ImageButton btnFootball;
    ImageButton btnBasketball;
    ImageButton btnHandball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnFootball = findViewById(R.id.btnFootball);
        btnBasketball = findViewById(R.id.btnBasketball);
        btnHandball = findViewById(R.id.btnHandball);
    }

    public void btnFootball(View view) {
        Intent intent= new Intent(this, Football.class);
        startActivity(intent);
    }

    public void btnBasketball(View view) {
        Intent intent= new Intent(this, Basketball.class);
        startActivity(intent);
    }


    public void btnHandball(View view) {
        Intent intent= new Intent(this, Handball.class);
        startActivity(intent);
    }
}