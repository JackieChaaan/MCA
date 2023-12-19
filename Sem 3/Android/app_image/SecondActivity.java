package com.example.app_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView genView;
    String g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        genView=(ImageView) findViewById(R.id.genView);
        g=getIntent().getStringExtra("Gender");
        if(g.equals("Male")){
            genView.setImageResource(R.drawable.male);
        }
        if(g.equals("Female")){
            genView.setImageResource(R.drawable.female);
        }
    }
}