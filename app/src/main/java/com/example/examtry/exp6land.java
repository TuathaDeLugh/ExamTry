package com.example.examtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class exp6land extends AppCompatActivity {
    TextView tv = findViewById(R.id.tv);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6land);
        Intent intent = getIntent();
        String extras= intent.getStringExtra("count");
        int count = Integer.parseInt(extras);
        int i = 0;
        while (i < count) {
            String old = tv.getText().toString();
            String h = "Hello World ";
            tv.setText(old + h);
            i++;
        }
    }
}