package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,passw;
    String u="Abel";
    String p="abel@123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        if (view.getId()==R.id.loginButton) {
            user = (EditText) findViewById(R.id.uname);
            passw = (EditText) findViewById(R.id.pass);
            String a = user.getText().toString();
            String b = passw.getText().toString();
            if (a.equals(u) && b.equals(p)) {
                Toast.makeText(this, "Login Successfull", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_LONG).show();
            }
        }
    }
}