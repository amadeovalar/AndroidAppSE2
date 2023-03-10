package com.example.first_empty_activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toast_button;
    Button count_button;

    TextView showCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast_button = findViewById(R.id.toast_button);

        toast_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Tatjana!", Toast.LENGTH_SHORT).show();
            }
        });

        count_button.findViewById(R.id.count_button);

        count_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(view);
            }
        });

    }

    public void disable(View v) {
        v.setEnabled(false);
    }

    public void countMe(View view){
        String countString = showCountTextView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;

        showCountTextView.setText(count.toString());
    }
}