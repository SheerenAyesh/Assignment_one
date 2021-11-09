package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import modle.java.sportes_data;

public class Welcome extends AppCompatActivity {
    ImageButton btnFootball;
    ImageButton btnBasketball;
    ImageButton btnHandball;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnFootball = findViewById(R.id.btnFootball);
        btnBasketball = findViewById(R.id.btnBasketball);
        btnHandball = findViewById(R.id.btnHandball);
        spinner=findViewById(R.id.spinner);
        getspinner();
    }

    private void getspinner() {
        sportes_data sd=new sportes_data();
        String []arr=sd.cat();
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this , android.R.layout.simple_spinner_item,arr);
        spinner.setAdapter(adapter);

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
    private void spinner(View view){
        sportes_data sd=new sportes_data();
        String []arr=sd.cat();
        if(spinner.getSelectedItem().toString().equals(arr[0])){
            Intent intent= new Intent(this, Football.class);
            startActivity(intent);

        }
        if(spinner.getSelectedItem().toString().equals(arr[1])){
            Intent intent= new Intent(this, Basketball.class);
            startActivity(intent);

        }
        if(spinner.getSelectedItem().toString().equals(arr[2])){
            Intent intent= new Intent(this, Handball.class);
            startActivity(intent);

        }
    }

    public void btnspinner(View view) {


    sportes_data sd=new sportes_data();
    String []arr=sd.cat();
        if(spinner.getSelectedItem().toString().equals(arr[0])){
                Intent intent= new Intent(this, Football.class);
        startActivity(intent);

        }
        if(spinner.getSelectedItem().toString().equals(arr[1])){
        Intent intent= new Intent(this, Basketball.class);
        startActivity(intent);

        }
        if(spinner.getSelectedItem().toString().equals(arr[2])){
        Intent intent= new Intent(this, Handball.class);
        startActivity(intent);

        }
        }}
