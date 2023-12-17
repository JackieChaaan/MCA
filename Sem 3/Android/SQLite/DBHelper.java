package com.example.sqlite;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "department_db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_DEPARTMENT = "department";
    public static final String COL_ID = "id";
    public static final String COL_DEPARTMENT_NAME = "department_name";
    public static final String COL_LOCATION = "location";

    private static final String CREATE_TABLE_DEPARTMENT =
            "CREATE TABLE " + TABLE_DEPARTMENT + " (" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_DEPARTMENT_NAME + " TEXT, " +
                    COL_LOCATION + " TEXT)";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_DEPARTMENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle database schema upgrades if needed
    }
}
