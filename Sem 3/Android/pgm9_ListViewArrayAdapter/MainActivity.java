package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView l;
    String[] days = {"Sunday","Monday","Tueday","Wednesday","Thursday","Friday","Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        TextView temp = (TextView) view;
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, temp.getText()+" "+i,Toast.LENGTH_LONG).show();
    }
}