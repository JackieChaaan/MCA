package com.example.newtoggle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    TextView toggleView;
    LinearLayout linearlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle=(ToggleButton) findViewById(R.id.toggle);
        toggleView=(TextView) findViewById(R.id.toggleView);
        linearlayout=(LinearLayout) findViewById(R.id.linearlayout);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    toggleView.setText("Toggle State:ON");
                    Toast.makeText(MainActivity.this,"Toggle ON",Toast.LENGTH_SHORT).show();
                    linearlayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.purple_700));
                }
                else{
                    toggleView.setText(("Toggle State:OFF"));
                    Toast.makeText(MainActivity.this,"Toggle OFF",Toast.LENGTH_SHORT).show();
                    linearlayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.teal_700));
                }
            }
        });
    }
}