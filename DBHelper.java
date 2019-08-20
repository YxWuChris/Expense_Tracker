package com.example.expensetracker;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper
{
    public DBHelper(Context context, String name, CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
        // TODO Auto-generated constructor stub
        Log.d("ae3mdp", "DBHelper");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("ae3mdp", "onCreate");
        // TODO Auto-generated method stub
        db.execSQL("CREATE TABLE if not exists people (" +
                "_id INTEGER PRIMARY KEY autoincrement," +
                "date DATE," +
                "category VARCHAR(128)," +
                "amount INTEGER" +
                ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS people");
        onCreate(db);
    }

}