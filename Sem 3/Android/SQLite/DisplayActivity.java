package com.example.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class DisplayActivity extends AppCompatActivity {

    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        dbHelper = new DBHelper(this);

        ListView listViewDepartments = findViewById(R.id.listViewDepartments);

        // Display the saved departments
        List<String> departmentList = getSavedDepartments();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, departmentList);
        listViewDepartments.setAdapter(adapter);
    }

    private List<String> getSavedDepartments() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        List<String> departmentList = new ArrayList<>();

        Cursor cursor = db.query(DBHelper.TABLE_DEPARTMENT, null, null, null, null, null, null);

        while (cursor.moveToNext()) {
            String departmentName = cursor.getString(cursor.getColumnIndex(DBHelper.COL_DEPARTMENT_NAME));
            String location = cursor.getString(cursor.getColumnIndex(DBHelper.COL_LOCATION));

            departmentList.add("Department: " + departmentName + ", Location: " + location);
        }

        cursor.close();
        db.close();

        return departmentList;
    }
}