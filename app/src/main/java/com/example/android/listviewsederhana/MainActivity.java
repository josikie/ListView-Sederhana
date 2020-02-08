package com.example.android.listviewsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] merekSmartphone = {"Lenovo", "Oppo", "Vivo", "Realme", "Xiaomi", "Samsung", "Sony", "Nokia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, merekSmartphone);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
    }
}
