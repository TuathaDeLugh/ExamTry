package com.example.examtry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class exp6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        EditText et;
        TextView tv;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        et = findViewById(R.id.et);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(et.getText().toString());
                int i = 0;
            while( i < count ){
                String old = tv.getText().toString();
                String h = "Hello World   ";
                tv.setText(old + h);
                i++;
            }
            }
        });
    }
}