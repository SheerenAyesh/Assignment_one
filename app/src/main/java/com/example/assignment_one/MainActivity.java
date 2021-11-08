package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHome = findViewById(R.id.btnHome);

    }

    public void btnHomeonClick(View view) {
        Intent intent= new Intent(this, Welcome.class);
        String str=btnHome.getText().toString();
        startActivity(intent);

    }

}