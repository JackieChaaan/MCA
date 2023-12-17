package com.example.sqlite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextId, editTextLocation;
    private Spinner spinnerDepartment;
    private Button btnSave;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);

        TextView textViewDepartment = findViewById(R.id.textViewDepartment);
        editTextId = findViewById(R.id.editTextId);
        spinnerDepartment = findViewById(R.id.spinnerDepartment);
        editTextLocation = findViewById(R.id.editTextLocation);
        btnSave = findViewById(R.id.btnSave);

        // Populate spinner with department names
        List<String> departmentList = getDepartmentList();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, departmentList);
        spinnerDepartment.setAdapter(adapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

    private void saveData() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        // The id is auto-incremented, so no need to insert it explicitly
        values.put(DBHelper.COL_DEPARTMENT_NAME, spinnerDepartment.getSelectedItem().toString());
        values.put(DBHelper.COL_LOCATION, editTextLocation.getText().toString());

        db.insert(DBHelper.TABLE_DEPARTMENT, null, values);
        db.close();

        // Navigate to the display activity
        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        startActivity(intent);
    }

    private List<String> getDepartmentList() {
        // Assume you have a method to get department names from your data source
        List<String> departmentList = new ArrayList<>();
        // Replace this with your actual data retrieval logic

        // Example:
        departmentList.add("Department A");
        departmentList.add("Department B");
        departmentList.add("Department C");

        return departmentList;
    }
}