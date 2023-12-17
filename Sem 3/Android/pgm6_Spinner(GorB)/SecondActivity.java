package com.example.girlorboy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String s=getIntent().getStringExtra("selected");
        ImageView g=findViewById(R.id.img);
        if("Male".equals(s)){
            g.setImageResource(R.drawable.boy);
        }
        else if("Female".equals(s)){
            g.setImageResource(R.drawable.girl);
        }
    }
}