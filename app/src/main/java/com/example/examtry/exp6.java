package com.example.examtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6);
        btn = findViewById(R.id.btn);
        et = findViewById(R.id.et);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(exp6.this, exp6land.class);
                String etval = et.getText().toString();
                i.putExtra("count",etval);
                startActivity(i);
            }
            });
    }
}