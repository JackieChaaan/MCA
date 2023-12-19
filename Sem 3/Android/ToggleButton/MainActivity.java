package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView stateTextView;
    RelativeLayout myRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton) findViewById(R.id.toggleButton);
        stateTextView=(TextView) findViewById(R.id.stateTextView);
        myRelative=(RelativeLayout) findViewById(R.id.idv);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    stateTextView.setText("Toggle State:On");
//                    myRelative.setBackgroundResource(R.color.red);
                    myRelative.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.red));

                }else {
                    stateTextView.setText("Toggle State:Off");
                    myRelative.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.teal_200));
                }
            }
        });
    }
}