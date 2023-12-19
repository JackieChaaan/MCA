package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton m,f;
    String male,female;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m=(RadioButton) findViewById(R.id.m);
        f=(RadioButton) findViewById(R.id.f);
        go=(Button) findViewById(R.id.go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m.isChecked()){
                    Intent i=new Intent(MainActivity.this,SecondActivity.class);
                    i.putExtra("Message","You selected Male");
                    startActivity(i);
                }
                if(f.isChecked()){
                    Intent i=new Intent(MainActivity.this,SecondActivity.class);
                    i.putExtra("Message","You selected Female");
                    startActivity(i);
                }
            }
        });
    }
}