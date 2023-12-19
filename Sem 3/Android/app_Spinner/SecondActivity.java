package com.example.app_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView itemView;
    String iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        itemView=(TextView)findViewById(R.id.itemView);
        iv=getIntent().getStringExtra("Item");
        itemView.setText(iv);
    }
}