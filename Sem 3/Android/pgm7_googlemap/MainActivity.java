package com.example.gmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent,chooser=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v) {
        if(v.getId()==R.id.LaunchMap)
        {
            intent=new Intent(intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:10.065206,76.629128"));
            chooser=intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
    }
}