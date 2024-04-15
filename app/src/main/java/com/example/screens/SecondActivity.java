package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String status = extras.getString("status");
            int errors = extras.getInt("errors");

            TextView errorsTextView = findViewById(R.id.errorsTextView);
            TextView statusTextView = findViewById(R.id.statusTextView);

            errorsTextView.append(status);
            statusTextView.append(String.valueOf(errors));
        }
    }
}