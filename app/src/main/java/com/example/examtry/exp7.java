package com.example.examtry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class exp7 extends AppCompatActivity {
    Spinner sp;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp7);
        sp=(Spinner)findViewById(R.id.sp);
        img=(ImageView)findViewById(R.id.img);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                switch (arg2) {
                    case 0:
                        img.setImageResource(R.drawable.image1);
                        break;
                    case 1:
                        img.setImageResource(R.drawable.image2);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.image3);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
}