package com.example.examtry;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class exp8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp8);
        view=(View)findViewById(R.id.myview);
    }
    View view;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        {
            super.onCreateOptionsMenu(menu);
            MenuItem mnu1 = menu.add(0,0,0,"Red");
            MenuItem mnu2 = menu.add(0,0,0,"Blue");
            MenuItem mnu3 = menu.add(0,0,0,"Green");
return  true;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }
        private boolean MenuChoice(MenuItem item){
            switch (item.getItemId()) {
                case 1:
                    view.setBackgroundColor(Color.RED);
                    break;
                case 2:
                    view.setBackgroundColor(Color.BLUE);
                    break;
                case 3:
                    view.setBackgroundColor(Color.GREEN);
                    break;
                default:
                    return super.onOptionsItemSelected(item);
            }
            return super.onOptionsItemSelected(item);
        }
    }
