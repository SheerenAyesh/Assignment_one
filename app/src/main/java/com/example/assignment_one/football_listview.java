package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class football_listview extends AppCompatActivity {

    ListView l;
    String sports[]
            = { "What is football?", "What is the origin of football?",
            "How many people play football?",
            "What is football’s premier tournament?" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                sports);
        l.setAdapter(arr);
    }
}