package com.zuri.counterApp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        TextView number = findViewById(R.id.number);

        findViewById(R.id.increment).setOnClickListener(v -> number.setText(++num+""));
    }
}