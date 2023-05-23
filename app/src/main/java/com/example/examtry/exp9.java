package com.example.examtry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

public class exp9 extends AppCompatActivity {
    Chronometer c;
    int i = 0;
    int duration = 5;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp9);
        c = (Chronometer) findViewById(R.id.cnm);
        tv = (TextView) findViewById(R.id.tv);
        c.start();
        c.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer arg0) {

                tv.setText("Meaasge will be displayed after " + (duration - (i + 1)) + " seconds");
                i++;
                if (i >= duration) {
                    Toast.makeText(getApplicationContext(), "Message" + (i / 5), Toast.LENGTH_LONG).show();
                    duration = duration + 5;
                }

            }
        });
    }
}