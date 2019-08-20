package com.example.expensetracker;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MyProviderContract
{
    public static final String AUTHORITY = "com.example.expensetracker.MyProvider";

    public static final Uri PEOPLE_URI = Uri.parse("content://"+AUTHORITY+"/people");

    public static final String ID = "_id";
    public static final String DATE = "date";
    public static final String CATEGORY = "category";
    public static final String AMOUNT = "amount";


    public static final String CONTENT_TYPE_SINGLE = "vnd.android.cursor.item/MyProvider.data.text";
    public static final String CONTENT_TYPE_MULTIPLE = "vnd.android.cursor.dir/MyProvider.data.text";

}