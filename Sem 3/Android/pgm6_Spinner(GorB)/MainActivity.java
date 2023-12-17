package com.example.girlorboy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner s;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = (Spinner) findViewById(R.id.spinner);
        b = (Button) findViewById(R.id.btn);
        String[] Gender = {"Male", "Female"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Gender);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selGender = s.getSelectedItem().toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("selected", selGender);
                startActivity(i);
            }
        });
    }
}