package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Basketball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
        final TextView txt1 = (TextView) findViewById(R.id.sm);

        new Thread(new Runnable() {
            public void run(){
                txt1.setText("Thread!!");
            }
        }).start();

    }
}
