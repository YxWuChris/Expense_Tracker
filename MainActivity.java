package com.example.expensetracker;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.TextInputEditText;
import android.util.Log;
import android.view.View;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity {

    public static String CONFIG_STORAGE_NAME = "my preferences";
    public static String CONFIG_PREFERENCE_1 = "preference 1";
    SimpleCursorAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void add(View v) {


        final TextInputEditText inputFieldDate = (TextInputEditText) findViewById(R.id.inputText1);
        String date = inputFieldDate.getText().toString();

        final TextInputEditText inputFieldCategory = (TextInputEditText)findViewById(R.id.inputText2);
        String category = inputFieldCategory.getText().toString();

        final TextInputEditText inputFieldAmount = (TextInputEditText)findViewById(R.id.inputText3);
        String amount = inputFieldAmount.getText().toString();

        ContentValues newValues = new ContentValues();

        newValues.put(com.example.expensetracker.MyProviderContract.DATE, date);
        newValues.put(com.example.expensetracker.MyProviderContract.CATEGORY, category);
        newValues.put(com.example.expensetracker.MyProviderContract.AMOUNT, amount);


        getContentResolver().insert(com.example.expensetracker.MyProviderContract.PEOPLE_URI, newValues);

        Intent intent = new Intent(MainActivity.this, ContentProviderUser.class);
        startActivity(intent);


    }

}