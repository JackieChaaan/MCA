package com.example.app_image;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView nameView,genderView;
    EditText name;
    Spinner spinner;
    String g;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameView=(TextView) findViewById(R.id.nameView);
        genderView=(TextView) findViewById(R.id.genderView);
        name=(EditText) findViewById(R.id.name);
        spinner=(Spinner) findViewById(R.id.spinner);
        go=(Button) findViewById(R.id.go);
        ArrayList <String>arr=new ArrayList<>();
        arr.add("Male");
        arr.add("Female");
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arr);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g=spinner.getSelectedItem().toString();
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("Gender",g);
                startActivity(i);
            }
        });
    }
}